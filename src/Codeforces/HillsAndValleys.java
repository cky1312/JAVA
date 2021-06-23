package Codeforces;
//wrong
import java.util.*;
public class HillsAndValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int c = 0;
            if(n==3){
                for(int i = 1; i < n-1; i++) {
                    if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                        arr[i] = Math.max(arr[i + 1], arr[i - 1]);
                        break;
                    }
                }
            }

            else {
                for (int i = 1; i < n - 1; i++) {
//                    if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
//                        arr[i] = Math.max(arr[i + 1], arr[i - 1]);
//                        break;
//                    }
                    if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                        arr[i] = Math.max(arr[i + 1], arr[i - 1]);
                        break;
                    }
                }
            }
            for (int i = 1; i < n - 1; i++) {
                if ((arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) || (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]))
                    c++;
            }
            System.out.println(c);
        }
    }
}
