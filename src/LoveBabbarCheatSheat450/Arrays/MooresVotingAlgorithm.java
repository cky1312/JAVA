package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class MooresVotingAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        isMajorityElement(arr,n);

    }

    static void isMajorityElement(int[] arr, int n){
        int majorityElement = probableMajorityElement(arr,n);

        int c = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == majorityElement)
                c++;
        }
        if(c > n/2)
            System.out.println(majorityElement);
        else
            System.out.println(-1);
    }
    static int probableMajorityElement(int[] arr, int n){
        int count = 1, majElement = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] == majElement)
                count++;
            else
                count--;
            if(count == 0){
                majElement = arr[i];
                count = 1;
            }
        }

        return majElement;
    }
}
