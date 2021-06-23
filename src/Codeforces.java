import java.util.Scanner;

public class Codeforces {
    static int lcm(int r, int s){
        int i = (r * s) / gcd(r,s);
        return i;
    }
    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum=0;
        int c=0,d=0;
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            for(int j=1;j<=x;j++){
                for(int k=1;k<=x;k++){
                    sum = gcd(j,k) + lcm(j,k);
                    if(sum == x){
                        c=j;
                        d=k;
                        break;
                    }
                }
            }
            System.out.println(c+" "+d);
            System.out.println("lcm is"+gcd(13, 82));
        }
    }
}
