package Class05;

import java.util.Scanner;

public class LargestCount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int noOfCandles = sc.nextInt();
        int[] candles = new int[noOfCandles];

        //take input
        for (int i = 0;i<noOfCandles;i++){
            candles[i] = sc.nextInt();
        }

        // highest of candles
        int highest = candles[0];
        for (int i = 1;i<noOfCandles;i++){
            if(candles[i] > highest){
                highest = candles[i];
            }
        }

        // count of highest
        int count = 0;
        for (int i =0;i<noOfCandles;i++){
            if(candles[i] == highest){
                count = count + 1;
            }
        }

        System.out.print(count);


    }

}
