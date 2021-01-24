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
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++) {
            sum = array[i];
            for(int j=i+1;j<n;j++) {
                sum = sum + array[j]; //-5
                maxsum = Math.max(sum, maxsum);
            }
        }
        for(int i=0;i<n;i++) {
            maxsum = Math.max(maxsum, array[i]);
        }
        System.out.println(maxsum);
    }
}


