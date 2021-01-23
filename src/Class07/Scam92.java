package Class07;

import java.util.Scanner;

public class Scam92 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int mini = prices[0];
        for (int i = 1; i < n; i++) { //n
            mini = Math.min(mini, prices[i]);
            if (prices[i] - mini > maxProfit) {
                maxProfit = prices[i] - mini;
            }
        }
        System.out.print(maxProfit);

    }

}