import java.util.Scanner;

public class ZooDesign {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long[] cost = new long[3];
            long minCost = Integer.MAX_VALUE, minI = 0;
            long maxCost = Integer.MIN_VALUE, maxI = 0;
            for (int i = 0; i < 3; i++) {
                cost[i] = sc.nextInt();
                if (cost[i] > maxCost) {
                    maxCost = (int) cost[i];
                    maxI = i;
                }
                if (cost[i] < minCost) {
                    minCost = (int) cost[i];
                    minI = i;
                }
            }
            long midI = 3 - (maxI + minI);
            long[] maxArea = new long[3];
            for (int i = 0; i < 3; i++) {
                maxArea[i] = sc.nextInt();
            }
            long[] m = new long[3];
            long[] n = new long[3];
            for (int i = 0; i < 3; i++) {
                m[i] = sc.nextInt();
                n[i] = sc.nextInt();
            }
            long tArea = sc.nextInt();

            long mincos = cost[(int) minI] * maxArea[(int) minI];
            tArea = tArea - maxArea[(int) minI];
            long maxcos = m[(int) maxI] * n[(int) maxI] * cost[(int) maxI];
            tArea = tArea - (m[(int) maxI] * n[(int) maxI]);
            long midcos = cost[(int) midI] * tArea;

            long totalCost = mincos + maxcos + midcos;
            System.out.println(totalCost);
        }
        catch (Exception ignored){

        }
    }
}
