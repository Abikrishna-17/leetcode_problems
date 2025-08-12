import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for(int i=0;i<nums.length;i++){

            if(table.containsKey(nums[i])){
                return true;
            }
            else{
            table.put(nums[i],1);
            }

        }
        return false;
    }
}
