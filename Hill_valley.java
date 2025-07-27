import java.util.Scanner;

public class Hill_valley {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = {2,4,1,1,6,5};
        int n = arr.length;
        int left = 0,count=0;
        for(int i=1;i<n-1;i++){

            if(arr[i]!=arr[i+1]){
                if((arr[i]>arr[left] && arr[i]>arr[i+1] )|| (arr[i]<arr[left] && arr[i]<arr[i+1])){
                    count++;
                }
                left=i;
            }
        }
        System.out.println(count);
    }
}
