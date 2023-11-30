// 1512. Number of Good Pairs

// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.

// Input: nums = [1,2,3]
// Output: 0

//Works for like minded handshakes

import java.util.HashMap;
import java.util.Map;

public class ArrayGoodPairs {
     Map<Integer,Integer> hmap=new HashMap<>();
      public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int pair:nums){
            int pairCount=hmap.getOrDefault(pair,0);
            System.out.print(pairCount+" ");
            ans=ans+pairCount;
            hmap.put(pair,pairCount+1);
        }
        return ans;
    }

    public void show(){
        System.out.println(hmap);
    }
    public static void main(String[] args) {
        ArrayGoodPairs a=new ArrayGoodPairs();

        int[] nums={8,2,3,8,4};   //0 0 0 1 0 --->1
        
        System.out.print("--->"+a.numIdenticalPairs(nums));
        System.out.println();
        a.show();
    }
}
