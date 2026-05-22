package tcs;

import java.util.*;

public class TcsCheatCoding {
    public static int compress(char[] chars) {
        // if(chars.length == 1){
        //     return 1;
        // }
        int n = chars.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
            System.out.println("i of for loop -> " + i);
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            System.out.println("i after while loop -> " + i);
            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        return idx;
    }

    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder str = new StringBuilder();
        //int k = 0;
        int[] arr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 'a']--;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                char ch = (char) ('a' + i);
                str.append(ch);
            }
        }
//        for (int i = 0; i < str1.length(); i++) {
//            boolean isFound = false;
//            for (int j = 0; j < str2.length(); j++) {
//                if (str1.charAt(i) == str2.charAt(j)) {
//                    isFound = true;
//                    break;
//                }
//            }
//            if (!isFound) {
//                str.append(str1.charAt(i));
//            }
//        }

        return str.toString();
    }


    public static void main(String[] args) {



        // leap year
        int n = 1700;
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not");
        }













        //prime numbers
//        int n = 9;
//        if(n <=1) {
//            System.out.println("not prime");
//        } else {
//            boolean flag = false;
//            for(int i=2;i*i<=n;i++) {
//                if(n%i == 0){
//                  flag = true;
//                  break;
//                }
//            }
//            if(!flag) {
//                System.out.println("prime");
//            } else {
//                System.out.println("no prime");
//            }
//        }


        //decimal to binary and toggle 0->1, 1-> 0

//        int n = 10; // 101
//
//        String binary = " ";
//        while (n != 0) {
//            int rem = n % 2;
//            //System.out.println(rem);
//            binary  =rem + binary;
//            n = n / 2;
//        }
//        binary =binary.trim();
//        String res = "";
//        for(int i=0;i<binary.length();i++) {
//            if(binary.charAt(i) == '1'){
//                res += '0';
//            } else {
//                res += '1';
//            }
//        }
//        System.out.println(binary);
//        System.out.println(res);


        // String compression
//        String s1 = "computer";
//        String s2 = "cat";
//        System.out.println(removeChars(s1, s2));

        // Replace element by rank
//        int[] arr = {20, 15, 26, 2, 98, 6};
//        int[] sorted = arr.clone();
//        Arrays.sort(sorted);
//        int N = arr.length;
//
//        // 2. Map each unique value to its rank
//        HashMap<Integer, Integer> rankMap = new HashMap<>();
//        int rank = 1;
//        for (int i = 0; i < N; i++) {
//            // Check for duplicates: only assign rank if the value isn't already in the map
//            if (!rankMap.containsKey(sorted[i])) {
//                rankMap.put(sorted[i], rank++);
//            }
//        }
//        // 3. Replace original elements with their mapped rank
//        for (int i = 0; i < N; i++) {
//            arr[i] = rankMap.get(arr[i]);
//        }
//        System.out.println(Arrays.toString(arr));


        // Move zeoroes to end
//        int[] arr = {2, 0, 3, 0, 4, 0, 5};
//        //output : {2,3,4,5,0,0,0}
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[k];
//                arr[k] = temp;
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // Non repeating elements
//        int[] arr = {1, 2, 3, 3, 4, 4, 5, 1, 2, 6, 7};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }


        // Moores voting algorithm - to find ele that appear greater than n/2 times in an array
//        int nums[] = {2, 2, 1, 1, 1, 2, 2};
//        int start = 0;
//        int end = nums.length - 1;
//
//        int count = 0;
//        int ele = 0;
//        while (start <= end) {
//            if (count == 0) {
//                ele = nums[start];
//            }
//            if (ele == nums[start]) {
//                count++;
//            } else {
//                count--;
//            }
//            start++;
//        }
//        System.out.println(ele);

        // Dutch Naitonal Flag Algorithm -> Sort 0;s, 1's and 2's
//        int arr[] = {2, 0, 1, 2, 2, 0, 0, 1, 1};
//        // {0,0,0,1,1,1,2,2,2}
//        int start = 0, mid = 0, end = arr.length - 1;
//
//        while (mid <= end) {
//            if (arr[mid] == 0) {
//                int temp = arr[start];
//                arr[start] = arr[mid];
//                arr[mid] = temp;
//                start++;
//                mid++;
//            } else if (arr[mid] == 1) {
//                mid++;
//            } else if (arr[mid] == 2) {
//                int temp = arr[end];
//                arr[end] = arr[mid];
//                arr[mid] = temp;
//                end--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // Equilibrium point
        // int[] arr = {1,2,0,3};
        // int res = -1;

        // int totalSum = 0;
        // for(int ele : arr) {
        //   totalSum += ele;
        // }

        // int leftSum = 0;
        // //int rightSum = 0;
        // for(int i=0;i<arr.length;i++) {
        //   int rightSum = totalSum - leftSum - arr[i];
        //   if(leftSum == rightSum){
        //     res = i;
        //     break;
        //   }
        //   leftSum += arr[i];
        // }

        // System.out.println(res);
    }
}
