package mypractice.practice;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {
        int firstMax = nums[0];
        for(int i=0; i<nums.length;i++){
            if(nums[i]>firstMax) {
                firstMax = nums[i];
            }
        }
        int secondMax = nums[0];
        for(int i=0; i<nums.length;i++){
            //System.out.println(nums[i] + " " + secondMax + " " + firstMax);
            if(nums[i]>secondMax && nums[i]!=firstMax){
                secondMax = nums[i];
            }
        }
        int thirdMax = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<thirdMax && nums[i]!=secondMax){
                thirdMax = nums[i];
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        int[] nums= {1,1,2}; // 2,2,1,3
        System.out.println(thirdMax(nums));

    }
}
