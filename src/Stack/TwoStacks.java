package Stack;

import java.util.*;

public class TwoStacks {

        int[] arr;
        int cap;
        int top1;
        int top2;
        TwoStacks(int n){
            cap = n;
            top1 = -1;
            top2 = cap;
            arr = new int[n];
        }
        void push1(int x){
            if(top1 < top2-1){
                top1++;
                arr[top1] = x;
            }
        }

        void push2(int x){
            if(top1 < top2-1){
                top2--;
                arr[top2] = x;
            }
        }

        int pop1(){
            if(top1 >= 0){
                int x = arr[top1];
                top1--;
                return x;
            }
            else
                System.exit(1);
            return 0;
        }

        int pop2(){
            if(top2<cap){
                int x = arr[top2];
                top2++;
                return x;
            }
            else
                System.exit(1);
            return 0;
        }


    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(5);
        ts.push1(10);
        ts.push2(45);
        ts.push2(7);
        ts.push1(15);
        ts.push2(18);
        System.out.println("Popped element from stack 1 is "+ ts.pop1());
        ts.push2(20);
        System.out.println("Popped element from stack 2 is "+ ts.pop2());
    }
}
