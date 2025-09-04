class Solution {
    public int findClosest(int x, int y, int z) {
        
        int diff1 = x-z;
        int diff2 = y-z;
        
        if(diff1 <0 ){
            diff1 = -(diff1);
        }
        if(diff2 <0){
            diff2 = -(diff2);
        }
        if(diff1 == diff2){
            return 0;
        }
        if(diff1 > diff2){
            return 2;
        }
        return 1;
    }
}
