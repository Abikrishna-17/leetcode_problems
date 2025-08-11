
import java.util.Hashtable;
class Solution {
    public int majorityElement(int[] nums) {
        
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(!table.containsKey(nums[i])){
            table.put(nums[i],1);
            }
            else {
                table.put(nums[i],table.get(nums[i])+1);
            }
        }
        for (int key : table.keySet()) {
            if (table.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }
}
