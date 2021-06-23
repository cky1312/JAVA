package GFG_Contest;

import java.util.*;
public class Get_The_Shadow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases:");
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            for(int i=0;i<n;i++){
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            int repeating=0;
            for (int i=0;i<n-1;i++){
                if(ar[i]==ar[i+1]) {
                    repeating = ar[i];
                    break;
                }
            }
            int missing=0;
            if(ar[0] != 1)
                missing = 1;
            else {
                for (int i = 0; i < n - 1; i++) {
                    if (ar[i] + 1 != ar[i + 1]) {
                        missing = ar[i] + 1;
                        break;
                    }
                }
            }
            System.out.println(repeating +" "+ missing);
        }
    }
}
