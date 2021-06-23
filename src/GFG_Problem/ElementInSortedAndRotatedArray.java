package GFG_Problem;
import java.util.*;
public class ElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){  // input array must be in sorted and rotated form
                arr[i] = sc.nextInt();
            }
            int res = searchInSortedAndRotated(arr,n,x);
            System.out.println(res);
        }
    }
    static int searchInSortedAndRotated(int[] arr, int n, int x){
        int l=0,h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[l] < arr[mid]){  //left half is sorted
                if(x >= arr[l] && x < arr[mid])
                    h = mid - 1;
                else
                    l = mid + 1;
            }
            else{         //right half is sorted
                if(x > arr[mid] && x <= arr[h])
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return -1;
    }
}
