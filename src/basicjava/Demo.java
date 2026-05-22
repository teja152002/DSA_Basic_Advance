import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Demo {

    static class Fraction implements Comparable<Fraction> {
        BigInteger num, den;

        Fraction(BigInteger n, BigInteger d) {
            if (d.signum() == 0) throw new ArithmeticException();
            if (d.signum() < 0) {
                n = n.negate();
                d = d.negate();
            }
            BigInteger g = n.gcd(d);
            num = n.divide(g);
            den = d.divide(g);
        }

        static Fraction one() {
            return new Fraction(BigInteger.ONE, BigInteger.ONE);
        }

        Fraction multiply(Fraction f) {
            return new Fraction(num.multiply(f.num), den.multiply(f.den));
        }

        Fraction divide(Fraction f) {
            return new Fraction(num.multiply(f.den), den.multiply(f.num));
        }

        boolean isInteger() {
            return den.equals(BigInteger.ONE);
        }

        public int compareTo(Fraction o) {
            return num.multiply(o.den).compareTo(o.num.multiply(den));
        }
    }

    static class Edge {
        String to;
        Fraction factor;
        Edge(String t, Fraction f) {
            to = t;
            factor = f;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) input.add(line);
        }

        if (input.isEmpty()) return;

        String[] componentsArray = input.get(0).split(",");
        List<String> components = new ArrayList<>();
        for (String c : componentsArray) components.add(c.trim());

        Map<String, List<Edge>> graph = new HashMap<>();
        for (String c : components) graph.put(c, new ArrayList<>());

        for (int i = 1; i < input.size(); i++) {
            String[] parts = input.get(i).split("\\s+is\\s+");
            if (parts.length != 2) continue;

            String A = parts[0].trim();
            String rhs = parts[1].trim();

            int idx = 0;
            while (idx < rhs.length() && Character.isDigit(rhs.charAt(idx))) idx++;

            BigInteger k = new BigInteger(rhs.substring(0, idx));
            String B = rhs.substring(idx).trim();

            graph.putIfAbsent(A, new ArrayList<>());
            graph.putIfAbsent(B, new ArrayList<>());

            graph.get(A).add(new Edge(B, new Fraction(BigInteger.ONE, k)));
            graph.get(B).add(new Edge(A, new Fraction(k, BigInteger.ONE)));
        }

        Map<String, Fraction> size = new HashMap<>();
        Queue<String> queue = new ArrayDeque<>();

        for (String start : graph.keySet()) {
            if (size.containsKey(start)) continue;

            size.put(start, Fraction.one());
            queue.add(start);

            while (!queue.isEmpty()) {
                String cur = queue.poll();
                for (Edge e : graph.get(cur)) {
                    if (!size.containsKey(e.to)) {
                        size.put(e.to, size.get(cur).multiply(e.factor));
                        queue.add(e.to);
                    }
                }
            }
        }

        String largest = components.get(0);
        for (String c : components) {
            if (size.get(c).compareTo(size.get(largest)) > 0) {
                largest = c;
            }
        }

        Fraction largestSize = size.get(largest);

        components.sort((a, b) -> size.get(b).compareTo(size.get(a)));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < components.size(); i++) {
            String c = components.get(i);
            Fraction coef = largestSize.divide(size.get(c));
            result.append(coef.num).append(c);
            if (i < components.size() - 1) result.append(" equals ");
        }

        System.out.print(result.toString());
    }
}