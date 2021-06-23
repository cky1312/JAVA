package Stack;

import java.util.Scanner;
import java.util.Stack;

public class previousGreaterElement {
    static void printPrevious(int arr[],int n){
        Stack<Integer>s = new Stack<>();
        s.push(arr[0]);

        for(int i=1;i<n;i++){
            while(s.isEmpty() == false && s.peek() <= arr[i]){
                s.pop();
            }
            int prevGreater = (s.isEmpty()?-1:s.peek());
            System.out.print(prevGreater+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printPrevious(arr,n);
    }
}
