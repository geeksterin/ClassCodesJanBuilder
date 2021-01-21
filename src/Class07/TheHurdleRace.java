package Class07;


import java.util.Scanner;

public class TheHurdleRace {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] heights = new int[n];
        for(int i = 0;i<n;i++){
            heights[i] = sc.nextInt();

        }

        // find the maximum
        int maxheight = heights[0];
        for (int i = 0;i<n;i++){
            if(maxheight< heights[i]){
                maxheight = heights[i];
            }
        }
        //if max > cap
        //ans = max-cap
        if (maxheight > k){
            System.out.print(maxheight - k);
        }
        else{
            System.out.print(0);
        }





    }

}
