import java.util.*;
public class codechef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int ar[] = new int[n];
            int p[] = new int[q];
            for(int i=0;i<n;i++) {
                ar[i] = sc.nextInt();
            }
            for(int i=0; i<q;i++){
                p[i] = sc.nextInt();
            }
            int b;
            int a;
            int odd=0;
            int even=0;
            int on=0;
            //String s="";
            for(int i=0;i<q;i++){
                for(int j=0;j<n;j++){
                    b=ar[j]^p[i];
                    while(b>0){
                        a=b%2;
                        if(a==1){
                            on++;
                        }
                        //s=s+a;
                        b=b/2;
                    }

                   // System.out.println(on);

                    if(on%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                    on=0;
                    }
                System.out.println(even+" "+odd);
                even=odd=0;

                }

            }
        }
    }

