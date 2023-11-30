// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Input: nums = [1,2,3,1]
// Output: true

// Input: nums = [1,2,3,4]
// Output: false


// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hset.contains(nums[i]))
                 return true;
                hset.add(nums[i]);
        }
        return false;
    }
}
