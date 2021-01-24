package class09;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr, n);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int arr[], int n) {
        for(int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
//Example

// 2, 9, 10, 11, 32, 3, 1

//Insertion Sort

// 2, 9, 11, 32, 10, 3, 1
// 2, 9, 10, 11, 32, 3, 1
// 2, 3, 9, 10, 11, 32, 1
// 1, 2, 3, 9, 10, 11, 32
