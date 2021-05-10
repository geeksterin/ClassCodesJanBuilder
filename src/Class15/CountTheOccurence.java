package Class15;

import java.util.Arrays;

public class CountTheOccurence {

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,5,5,6,7,8,1,1,1,1,2,3};
        // sort
        Arrays.sort(arr);

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //  iterate over it
            // count the number of occurences

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1] + " " + count);
                count = 1;
            }
        }

        System.out.println(arr[arr.length-1] + " " + count);
    }
}
