package arryaprograms;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "eksrg";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                // System.out.println(s1.subSequence(i, j).equals(s2));
                String temp = (String) s1.subSequence(i, j);
                if (temp.contentEquals(s2)) {
                    System.out.println(s1.subSequence(i, j));
                }
            }
        }


    }
}
