package class09;

import java.util.Scanner;

public class ShiftingZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt(); //1 0 1 0 1 1 0 0 1
        }
        //iterate
        int start = 0;
        int end = n-1;
        while(start < end) {
            if(arr[start] == 0) {
                swap(arr, start, end);
                if(arr[start] == 1) {
                    start++;
                }
                end--;
            }
            else  {
                start++;
            }
        }
        for(int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void swap(int arr[], int start, int end) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

//example
//1 0 1 0 1 1 0 0 1

// 9, 2, 11, 32, 10, 3, 1


//Insertion Sort

// 2, 9, 11, 32, 10, 3, 1
// 2, 9, 10, 11, 32, 3, 1
// 2, 3, 9, 10, 11, 32, 1
// 1, 2, 3, 9, 10, 11, 32

//Merge sort - recursion
//quick sort - recursion
//heap sort  - heap data structure

//heap