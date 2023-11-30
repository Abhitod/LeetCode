// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Input: nums = [3,2,3]
// Output: 3

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.Arrays;

public class MajorityElement {
   public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        for(int num:nums){
            System.out.print(num);
        }
        System.out.println();
        int n=nums.length-1;
        int ans=nums[n/2];
        return ans;
    }   
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,7,3};
        MajorityElement m=new MajorityElement();
        System.out.println(m.majorityElement(nums));
    }
}
