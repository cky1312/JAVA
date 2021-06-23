package Codeforces;

import java.util.*;
public class NewColony {

    static boolean isDescending(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            if(arr[i] < arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int pos = 0;
            while(k>0) {
                if(isDescending(arr,n)){
                    pos = -1;
                    break;
                }
                for (int i = 0; i < n - 1; ) {
                    if (arr[i] >= arr[i + 1])
                        i++;
                    else if (arr[i] < arr[i + 1]) {
                        arr[i] += 1;
                        pos = i+1;
                        break;
                    }
                    else if(arr[i] >= arr[i+1] && i == n-1) {
                        pos = -1;
                        break;
                    }
                }
                k--;
            }
            System.out.println(pos);
        }
    }
}
