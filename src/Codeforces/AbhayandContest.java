package Codeforces;

import java.util.*;
public class AbhayandContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int j = n-1,c = 0;
        int max = Arrays.stream(arr).max().getAsInt();
        if(k>max){
            System.out.println(n);
        }
        else {
            for (int i = 0; i < n;) {
                if(i > j)
                    break;
                if(i == j){
                    if(arr[i] <= k) {
                        c++;
                        break;
                    }
                    else
                        break;
                }
                if(arr[i] > k && arr[j] > k)
                    break;
                if(arr[i] <= k) {
                    c++;
                    i++;
                }

                if(arr[j] <= k) {
                    c++;
                    j--;
                }
            }
            System.out.println(c);
        }
    }
}
