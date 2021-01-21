package Class07;

import java.util.Scanner;

public class Scam92 {

    // HW dry run the code and find complexity , discuss in TA session how we can reduce the time complexity
    private static int minimumTillNow(int[] prices, int lastPoint) {
        int minimum = prices[0];
        for (int i = 0;i<lastPoint;i++){
            if(minimum>prices[i]){
                minimum = prices[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i =0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        int maxProfit = 0;
        for (int i = 1;i<n;i++){
            int mini = minimumTillNow(prices,i);
            if(prices[i] - mini > maxProfit){
                maxProfit = prices[i] - mini;
            }
        }
        System.out.print(maxProfit);


    }



}
