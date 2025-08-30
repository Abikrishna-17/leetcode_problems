class NumArray {

    int[] nums ;
    public NumArray(int[] nums) {
        
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum =0;
        if(left == right){
            int a = nums[left];
            return a;
        }
        else if(nums.length==0){
            return 0;
        }
        while(left<right){
            sum = sum + nums[left];
            left++;
        }
        return sum+nums[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
