package revision.array;

import java.util.HashSet;

public class LongestConsecutive {
     public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();        
        for(int num : nums){
            hashSet.add(num);
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int count = 1 ;
            if(!hashSet.contains(nums[i]-1)){
             while(hashSet.contains(nums[i]+count)){
              count++;
             }
             res = Math.max(count,res);
            }
        }
        return res;
    }
}
