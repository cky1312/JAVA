package GFG_Problem;
import java.util.*;
public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0,max1=0;
            for(int i=0;i<n;i++){
                if(arr[i]==1) {
                    count++;
                    if(i==n-1)
                        max1=count;
                }
                else{
                    max1=Math.max(count,max1);
                    count = 0;
                    
                }
            }
            System.out.println(max1);
        }
    }
}
