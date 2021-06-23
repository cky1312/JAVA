package Codeforces;

import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int left = 0, right = n-1,i=0;
            int[] brr = new int[n];
            while(left <= right){
                if(i%2 == 0) {
                    brr[i] = arr[left];
                    left++;
                    i++;
                }
                else{
                    brr[i] = arr[right];
                    right--;
                    i++;
                }
            }
            for (int j:brr
                 ) {
                System.out.print(j+" ");
            }
        }
    }
}
