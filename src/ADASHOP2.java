import java.io.IOException;
import java.util.Scanner;

public class ADASHOP2 {
    static void route(){
        System.out.println("2 2");
        System.out.println("1 3");
        System.out.println("3 1");
        System.out.println("2 2");
        System.out.println("3 3");
        System.out.println("2 4");
        System.out.println("1 5");
        System.out.println("4 2");
        System.out.println("5 1");
        System.out.println("3 3");
        System.out.println("4 4");
        System.out.println("3 5");
        System.out.println("2 6");
        System.out.println("1 7");
        System.out.println("5 3");
        System.out.println("6 2");
        System.out.println("7 1");
        System.out.println("4 4");
        System.out.println("5 5");
        System.out.println("4 6");
        System.out.println("3 7");
        System.out.println("2 8");
        System.out.println("6 4");
        System.out.println("7 3");
        System.out.println("8 2");
        System.out.println("5 5");
        System.out.println("6 6");
        System.out.println("5 7");
        System.out.println("4 8");
        System.out.println("7 5");
        System.out.println("8 4");
        System.out.println("6 6");
        System.out.println("7 7");
        System.out.println("6 8");
        System.out.println("8 6");
        System.out.println("7 7");
        System.out.println("8 8");
    }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int count = 37;
            if(r==1 && c==1){
                System.out.println(count);
                route();
            }
            else if(r==c){
                count=count+1;
                System.out.println(count);
                System.out.println("1 1");
                route();
            }
            else{
                count=count+2;
                int s=(r+c)/2;
                System.out.println(count);
                System.out.println(s+" "+s);
                System.out.println("1 1");
                route();
            }

        }
    }
}
