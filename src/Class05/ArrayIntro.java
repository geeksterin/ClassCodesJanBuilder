package Class05;

import java.util.Scanner;

public class ArrayIntro {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 10;

        // create an array of int of size 100 and name it studentMarks
        int[] studentMarks = new int[10];


        for (int i = 0;i<10;i++){
            studentMarks[i] = sc.nextInt();
        }

// ====================== Sum of array =================================================
        int sum = 0;
        for (int i = 0;i<10;i++){
            sum = sum + studentMarks[i];
        }
// ------------------------------- maximum in array -----------------------------------------
        int largest = studentMarks[0];
        for (int i = 1; i<10;i++) {
            if (studentMarks[i] > largest) {
                largest = studentMarks[i];
            }
        }
// ------------ smallest number

//        int[] arr = new int[100];
        int smallest = studentMarks[0];
        for (int i = 1;i<10;i++){
            if (studentMarks[i]<smallest){
                smallest = studentMarks[i];
            }

        }
//        System.out.print(smallest);



//        ------------------------- Second largest Number --------------------------------------
        // find largest
        int largest1 = studentMarks[0];
        for (int i = 1;i<10;i++){
            if(studentMarks[i] > largest1){
                largest1 = studentMarks[i];
            }
        }

        // find the position
        int indexoflargest = -1;
        for (int i = 0;i<10;i++){
            if (studentMarks[i] == largest1){
                indexoflargest = i;
            }
        }

        // swap it with 0th index
        int temp = studentMarks[0];
        studentMarks[0] = studentMarks[indexoflargest];
        studentMarks[indexoflargest] = temp;

        // again find largest number from 1 - n
        int secondLargest = studentMarks[1];
        for (int i = 2;i<10;i++){
            if(studentMarks[i] > secondLargest){
                secondLargest = studentMarks[i];
            }
        }

        System.out.print(secondLargest);

    }

}
