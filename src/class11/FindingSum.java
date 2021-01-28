package class11;

import java.util.Scanner;

public class FindingSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int b[] = new int[k];
        for(int i=0;i<k;i++) {
            b[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();

        findSum(a, b, sum);
    }

    public static void findSum(int a[], int b[], int sum) {

        for(int i=0;i<a.length;i++) {
            int elementToFind = sum - a[i];
            int start = 0;
            int end = b.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if(elementToFind == b[mid]) {
                    System.out.println(a[i] + " " + b[mid]);
                    break;
                }
                if(elementToFind < b[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }
    }
}

//i want to find only one combination
//1 2 3 4 5 6
//0 2 3 4 5 6
//6

// -- 1 element = 5
  //start =0 , end = 5 , mid = 2, b[2] = 3
  //start = 3, end = 5,  mid = 4, b[4] = 5 --- 1 and 5
// -- 2 element = 4
    //start = 0, end = 5 , mid = 2 , b[2] = 3
    //start = 3, end = 5, mid = 4, b[4] = 5
    //start = 3, end = 4, mid = 3, b[3] = 4  ---- 2 and 4