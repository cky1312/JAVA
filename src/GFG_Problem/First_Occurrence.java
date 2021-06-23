package GFG_Problem;

import java.util.*;
public class First_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int res = firstOccurrence(arr,n,k);
            System.out.println(res);
        }
    }
    static int firstOccurrence(int arr[],int n,int k){
        int f=0,l=n-1;
        while(f<=l){
            int mid = (f+l)/2;
            if(arr[mid]>k)
                l=l-1;
            else if(arr[mid]<k)
                    f=f+1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return mid;
                else
                    l=mid-1;
            }
        }
        return -1;
    }
}
