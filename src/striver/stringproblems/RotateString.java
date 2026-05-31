package striver.stringproblems;

import java.util.*;

public class RotateString {
    public static String rotate(String goal) {
        String res = "";
        res = res + goal.charAt(goal.length() - 1);
        res += goal.substring(0, goal.length() - 1);
        return res;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chs = s.toCharArray();
        char[] cht = s.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);

        System.out.println(Arrays.toString(chs));
        System.out.println(Arrays.toString(cht));

        boolean flag = true;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] != cht[i]) {
                flag = false;

            }
        }
        return flag;
    }

    static void main(String[] args) {


        String s = "42";
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            System.out.println(ch + " - " + ch1);
            if (Character.isDigit(ch)) {
                num += ch;
            } else if (ch == '-') {
                num += ch;
            }
            if (Character.isAlphabetic(ch1)) {
                break;
            }
        }
        System.out.println(num);


//        String s = "cccaaa";
//        TreeMap<Character, Integer> map = new TreeMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        TreeMap<Character, Integer> sortedMap = new TreeMap<>((k1, k2) -> {
//            int compare = map.get(k2).compareTo(map.get(k1));
//
//            // Important: avoid returning 0 for different keys
//            return (compare == 0) ? k1.compareTo(k2) : compare;
//        });
//        sortedMap.putAll(map);
//        System.out.println(sortedMap);

//        String res = "";
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            int x = entry.getValue();
//            while (x != 0) {
//                res += entry.getKey();
//                x--;
//            }
//        }
//        System.out.println(res);
//        String s = "acr";
//        String t = "car";
//        System.out.println(isAnagram(s,t));
//        int[] arr = new int[26];
//        for(int i=0;i<s.length();i++) {
//            arr[s.charAt(i) - 'a']++;
//            arr[t.charAt(i) - 'a']--;
//        }
//        System.out.println(Arrays.toString(arr));
        //System.out.println(rotate(goal));
//        String res = "";
//        char ch = s.charAt(0);
//        for (int i = 0; i < goal.length(); i++) {
//            if (ch == goal.charAt(i)) {
//                System.out.println(res);
//                res += goal.substring(i, goal.length());
//                res += goal.substring(0, i);
//                System.out.println(res);
//                break;
//            }
//        }
//        System.out.println(res);
    }


}
