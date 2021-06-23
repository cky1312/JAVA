package Codeforces;

import java.util.*;
public class SameDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(countPairs2(arr,n));
        }
    }

//    static int countPairs(int[] arr, int n){
//        int count = 0;
//        for(int i = 0; i < n - 1; i++){
//            for(int j = i + 1; j < n; j++){
//                if(arr[j] - arr[i] == j - i)
//                    count++;
//            }
//        }
//        return count;
//    }
    static int countPairs2(int[] arr, int n){
        int ans = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            arr[i] = arr[i] - i;
//            if(!m.containsKey(arr[i])){
//                m.put(arr[i],1);
//            }
//            else
//                m.put(arr[i],m.get(arr[i])+1);
//        }
        for (int i = 0; i < n; i++)
            m.put(arr[i] - i, 0);

        for (int i = 0; i < n; i++)
            m.put(arr[i] - i, m.get(arr[i] - i) + 1);
        for (int x : m.values())
        {
            ans += (( x * (x - 1)) / 2);
        }
        return ans;
    }
}
