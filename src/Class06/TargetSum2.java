package Class06;

import java.util.Scanner;

public class TargetSum2 {

    public static void main(String[] args){
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
        int start = 0;
        int end = n-1;
        // untill start < end
            // if sum is greater than target
                // end = end-1
            //if sum is less than target
                // start = start + 1
            // id sum = target sum
                // istargetsumfound = true
        boolean isTargetSumFound = false;
        // printing 0-9 using while loop
        while(start < end){
            if(arr[start]+arr[end] > targetSum){
                end = end -1;
            }
            else if(arr[start]+arr[end] < targetSum){
                start = start+1;
            }
            else{
                isTargetSumFound = true;
                break;

            }
        }

        if (isTargetSumFound == true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }



    }

}
