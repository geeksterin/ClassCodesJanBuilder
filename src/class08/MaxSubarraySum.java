package class08;

import java.util.Scanner;

public class MaxSubarraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        int max_ending_here = 0;
        int max_till_now = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            max_ending_here = max_ending_here + array[i];
            if(max_till_now < max_ending_here)
                max_till_now = max_ending_here;
            if(max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_till_now);
    }
}

//1 0 1 1 0 0 1 0 1 0

//0 0 0 0 0


//1 1 1 1 1 0 0 0 0 0


//1. compare the element if it is 0 move it to the last else keep it as it is

//count no of zeros and create new array
//shifting to the right














//-2, -3, 4


//we found all the subarrays and calculated the max sum
