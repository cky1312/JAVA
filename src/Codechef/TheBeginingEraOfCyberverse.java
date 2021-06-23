package Codechef;
import java.util.*;
public class TheBeginingEraOfCyberverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(n == k){
                System.out.println("1");
            }
            else{
                int a = k/n;
                System.out.println(a);
            }
            // By another logic
//            int[] arr = new int[n];
//            for(int i = 0; i < n; i++){
//                arr[i] = 0;
//            }
//            int curr = 0;
//            for(int i = 0; i < k; i++){
//                arr[curr]++;
//                curr++;
//                if(curr==n)
//                    curr = 0;
//            }
//            for (int i:arr
//                 ) {
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//            System.out.println(arr[n-1]);
        }
    }
}
