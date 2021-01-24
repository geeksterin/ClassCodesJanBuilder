package Class07;

import java.util.Scanner;

public class Scam92 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i =0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int mini = prices[0];
        for (int i = 1;i<n;i++){ //n
            mini = Math.min(mini, prices[i]);
            if(prices[i] - mini > maxProfit){
                maxProfit = prices[i] - mini;
            }
        }
        System.out.print(maxProfit);

    }

}

//prefix sum

//soravHome  - jitendraHome = 300km
//jitendraHome - utkarshHome = 400km
//utkarshHome - Himanshu = 300km
//himanshu - prashant = 500km


//300 -0 , 400 -1, 300 -2, 500 -3

//2,3 - 800 o(n) ----------- k
//0,1 - 700 o(n)
//0,2 - 1000 ..
//0,3 - 1500 ..
//..
//..
//..
//..
//..

//Max(o(n) or o(k))

//300, 400, 300, 500 --------- find a number 400 - 2, 500 - 100 o(n)

