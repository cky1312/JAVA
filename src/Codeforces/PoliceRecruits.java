package Codeforces;

import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                c += arr[i];
            }
            else{
                if(c>0){
                    arr[i]=0;
                    c--;
                }
            }
        }
        c=0;
        for(int i = 0;i<n;i++) {
            if(arr[i]<0)
                c++;
        }
        System.out.println(c);
    }
}
