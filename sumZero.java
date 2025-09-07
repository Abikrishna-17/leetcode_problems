class Solution {
    public int[] sumZero(int n) {
        
        int j=0;
        int arr[] = new int[n];
        if(n%2==0){
            for(int i=-n/2;i<=n/2;i++){
                if(i!=0){
                arr[j]=i;
                j++;
                }
            }
        }
        else{
            for(int i=-n/2;i<=n/2;i++){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
}
