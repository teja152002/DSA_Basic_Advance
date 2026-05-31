package striver.arrayeasyproblems;

public class RemoveDuplicatesFromSorted {
    public static int removeDuplicates(int[] nums) {
        // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        // for(int ele : nums) {
        //     map.put(ele, map.getOrDefault(ele, 0)+1);
        // }
        // int count = 0, i =0;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     nums[i++] = entry.getKey();
        //     count++;
        // }
        // return count;
        int i = 0, j = 1;
        int n = nums.length - 1;
        while (j <= n) {
            if (nums[i] == nums[j]) {
                j++;
            } else if (nums[i] < nums[j]) {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        return (i + 1);

    }

    static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
