package striver.arrayeasyproblems;

import java.util.*;
public class MedianTwoSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int ele : nums1) {
            set.add(ele);
        }
        for (int ele : nums2) {
            set.add(ele);
        }
        Collections.sort(set);
        double res = 0;
        int n = set.size();
        if (n % 2 == 0) {
            int mid = n / 2;
            res = (double) (set.get(mid) + set.get(mid - 1)) / 2;
        } else {
            int mid = n / 2;
            res = set.get(mid);
        }
        return res;

    }
}
