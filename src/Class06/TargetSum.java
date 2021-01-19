package Class06;

import java.util.Scanner;

public class TargetSum {

   public static void main(String[] args ) {
       Scanner sc = new Scanner(System.in);
       // taking size of the array
       int n = sc.nextInt();
       // taking array input
       int[] arr = new int[n];
       for (int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       // taking input target sum
       int targetSum = sc.nextInt();
       // logic

       boolean isTargetPairFound = false;
       for (int i = 0;i<n;i++){
           for (int j = i+1;j<n;j++){
               if(arr[i] + arr[j] == targetSum){
                   isTargetPairFound = true;
               }
           }
       }
       if(isTargetPairFound == true){
           System.out.print("Yes");
       }
       else{
           System.out.print("No");
       }

   }


}
