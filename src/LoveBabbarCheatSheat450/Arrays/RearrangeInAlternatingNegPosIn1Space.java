package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class RearrangeInAlternatingNegPosIn1Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            rearrange(arr,n);       // O(n^2)     O(1)
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void rightRotate(int[] arr,int to, int from){
        int temp = arr[to];
        for(int i = to; i > from; i--){
            arr[i] = arr[i - 1];
        }
        arr[from] = temp;
    }
    static void rearrange(int[] arr, int n){
        int wrongIndex = -1;
        for(int i = 0; i < n; i++){
            if(wrongIndex != -1){
                if((arr[wrongIndex] >= 0 && arr[i] < 0)  || (arr[wrongIndex] < 0 && arr[i] > 0)){
                    rightRotate(arr,i,wrongIndex);

                    if(i - wrongIndex >= 2)
                        wrongIndex += 2;
                    else
                        wrongIndex = -1;
                }
            }
            else {
                if((arr[i] < 0 && i % 2 == 1) || arr[i] > 0 && i % 2 == 0)
                    wrongIndex = i;
            }
        }
    }
}
