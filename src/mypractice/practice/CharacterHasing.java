package mypractice.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharacterHasing {
    public static void main(String[] args) {
        String s = "asdfghjkjhgfdsasdfghjkitrwertyunxcvbn";
        // For Lower Case
        int[] countChar = new int[26];
        for(int i=0; i<s.length(); i++){
            countChar[s.charAt(i) - 'a']++;
        }

        System.out.println(countChar['a']);

        // For Upper Case
//        int[] countChar = new int[26];
//        for(int i=0; i<s.length(); i++){
//            countChar[s.charAt(i) - 'A']++;
//        }
//
//        System.out.println(countChar['A']);

        // For all characters. There are 256 characters according to the ASCI
//        int[] countChar = new int[256];
//        for(int i=0; i<s.length(); i++){
//            countChar[s.charAt(i)]++;
//        }
//
//        System.out.println(countChar['a']);



    }
}
