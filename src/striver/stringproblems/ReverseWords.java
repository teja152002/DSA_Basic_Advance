package striver.stringproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseWords {
    public static String longestCommonPrefix(String[] s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length; i++) {
            for (char ch : s[i].toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        int n = s.length;

        String res = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                res += entry.getKey();
            } else if (entry.getValue() == n * 2) {
                res += entry.getKey();
                res += entry.getKey();
            } else {
                break;
            }
        }
        return res;

    }

    static void main(String[] args) {

        // Reverse Words without extra spaces
//        String s = "a good   example";
//        String res = "";
//        for(String str : s.split("\\s+")){
//            res = str + " " + res ;
//        }
//        System.out.println(res.trim());

        // longest odd number
//        String s = "35427";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int num = s.charAt(i) - '0';
//            if (num % 2 == 1) {
//                System.out.println(s.substring(0, i+1));
//                break;
//            }
//        }

        // Longest common prefix
//        String[] s = {"aa", "aa"};
//        System.out.println(longestCommonPrefix(s));

        // Isomorphic Strings
        String a = "badc";
        String b = "baba";
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if (map.containsKey(ch1)) {
                // existing mapping should match
                if (map.get(ch1) != ch2) {
                    System.out.println(false);
                    return;
                }
            } else {
                // value already mapped by another key
                if (map.containsValue(ch2)) {
                    System.out.println(false);
                    return;
                }
                map.put(ch1, ch2);
            }
        }
        System.out.println(true);


    }
}
