package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stockSpanProblem {
    static void printStack(int arr[],int n){
        Stack<Integer>s = new Stack<>();
        s.push(0);
        System.out.print(1+" ");

        for(int i=1;i<n;i++){
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i - s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            printStack(arr,n);
    }
}
