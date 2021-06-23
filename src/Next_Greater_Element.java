import java.io.IOException;
import java.util.Scanner;

public class Next_Greater_Element {
    //   public static void nextLargerInteger(int[] ar){
//        for(int i=0;i<ar.length;i++){
//            if(i == ar.length-1) {
//                System.out.println(ar[i] + ",-1");
//                break;
//            }
//            for(int j=i+1;j<ar.length;j++)
//            {
//                if(ar[i]<ar[j]){
//                    System.out.println(ar[i]+","+ar[j]);
//                    break;
//                }
//                if(j == ar.length - 1){
//                    System.out.println(ar[i]+",-1");
//                    break;
//             }
//            }
//
//            }
//        }
//
//    public static void main(String[] args)throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            int n = sc.nextInt();
//            int[] ar = new int[n];
//            for(int i=0;i<n;i++){
//                ar[i] = sc.nextInt();
//            }
//            nextLargerInteger(ar);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            String s1="";
            String rev = "";
            for(int j=l-1;j<=r-1;j++){
                s1 = s1+s.charAt(j);
            }
            for(int k=r-1;k>=l-1;k--){
                rev = rev+s.charAt(k);
            }
            if(rev.equals(s1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
