import java.util.Objects;
import java.util.Stack;
import java.util.*;

public class Practice {

    public static int gcd(int a, int b) {
//        if (a == 0) {
//            return b;
//        }
//        return gcd(b % a, a);
        int gcd = 1;
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

//        String s1 = "Listen";
//        String s2 = "Silent";
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//        int[] temp = new int[26];
//        boolean isAnagram = true;
//        if (s1.length() == s2.length()) {
//            for (int i = 0; i < s1.length(); i++) {
//                temp[s1.charAt(i) - 'a']++;
//            }
//            for (int i = 0; i < s2.length(); i++) {
//                temp[s2.charAt(i) - 'a']--;
//            }
//            for (int i = 0; i < temp.length; i++) {
//                if (temp[i] != 0) {
//                    isAnagram = false;
//                    break;
//                }
//            }
//        } else {
//            System.out.println("Not an anagram !");
//        }
//        if (isAnagram) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not an anagram");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of elements : ");
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter target value : ");
//        int k = sc.nextInt();
//
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            int complement = k - arr[i];
//
//            if (map.containsKey(complement)) {
//                count += map.get(complement);
//            }
//
//            // Add current number to map (or increment its frequency)
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//        System.out.println("Total pairs: " + count);


//        String s = "I am very happy today".toLowerCase();
//
//        StringBuilder result = new StringBuilder();
//
//        // Traverse each character
//        for (char ch : s.toCharArray()) {
//            // Convert to lowercase for comparison
//            char lower = Character.toLowerCase(ch);
//
//            // Skip vowels
//            if (lower == 'a' || lower == 'e' || lower == 'i' ||
//                    lower == 'o' || lower == 'u') {
//                continue;
//            }
//
//            // Append non-vowel
//            result.append(ch);
//        }
//        System.out.println(result);
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (String word : words) {
//            if (word.length() > 0) {
//                if (word.length() == 1) {
//                    // Handle single letter words (e.g., "a")
//                    result.append(word.toUpperCase());
//                } else {
//                    // Extract first, middle, and last
//                    char first = Character.toUpperCase(word.charAt(0));
//                    String middle = word.substring(1, word.length() - 1);
//                    char last = Character.toUpperCase(word.charAt(word.length() - 1));
//
//                    result.append(first).append(middle).append(last);
//                }
//                result.append(" "); // Add space back after the word
//            }
//        }
//
//        System.out.println("Result: " + result.toString().trim());
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        // binary to decimal
//        long sum = 0;
//        int pow = 0;
//
//        while(n!=0) {
//            int rem = n % 10;
//            sum += (rem * Math.pow(2,pow++));
//            n = n/10;
//        }
//        System.out.println(sum);

        // decimal to binary
//        //StringBuilder sb = new StringBuilder();
//        if (n == 0) {
//            System.out.println("0");
//            return;
//        }
//        StringBuilder sb = new StringBuilder();
//        while (n > 0) {
//            int rem = n % 2;
//            sb.insert(0, rem);
//            n = n / 2;
//        }
//        System.out.println(sb);
    }
}
