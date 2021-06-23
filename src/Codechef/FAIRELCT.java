package Codechef;

import java.util.*;
public class FAIRELCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();

            long[] arr = new long[(int)n];
            long[] brr = new long[(int) m];
            long sumJohn = 0, sumJack = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sumJohn += arr[i];
            }

            for(int i = 0; i < m; i++){
                brr[i] = sc.nextInt();
                sumJack += brr[i];
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            long c = 0;
            int j = brr.length-1;
            if (n < m) {
                for (int i = 0; i < m; i++) {
                    if(sumJohn > sumJack){
                        break;
                    }
                    else{
                        sumJohn += brr[j]-arr[i];
                        sumJack += arr[i]-brr[j];
                        c++;
                        j--;
                        if(i == n-1)
                            break;
                    }
                }

            }
            else{
                for(int k = 0 ; k < n; k++){
                    if(sumJohn > sumJack) {
                        break;
                    }
                    else{
                        sumJohn += brr[j]-arr[k];
                        sumJack += arr[k]-brr[j];
                        c++;
                        j--;
                        if(k == m-1)
                            break;
                    }
                }
            }
            if(sumJohn>sumJack)
                System.out.println(c);
            else
                System.out.println("-1");
        }
    }
}
