import java.io.IOException;
import java.util.Scanner;

class MDSWIN2 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n+1];
            for(int i=1;i<=n;i++){
                ar[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            for(int i=0;i<q;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int c=0;
                if(l==r) {
                    System.out.println("1");
                    //break;
                }
                else if((r-l)==1) {
                    System.out.println("0");
                    //break;
                }
                else {
                    for (int j = l; j <= r; j++) {
                        c=c+1;
                        int d=ar[l];
                        if(d==ar[j+1])
                            c=c+1;
                    }
                    System.out.println(c);
                }
            }
        }
    }
}
