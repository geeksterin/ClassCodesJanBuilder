package Class10;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};

        for (int i = 0;i<arr.length;i++){
            //select the perfect candidate for ith index
            int index = findMinIndex(arr,i);

            //swap this with ith
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;


        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    private static int findMinIndex(int[] arr, int i) {
        int smallestNumber = arr[i];
        int minNumberIndex = i;

        for (int j = i+1;j< arr.length;j++){
            if(arr[j] < smallestNumber){
                smallestNumber = arr[j];
                minNumberIndex = j;
            }
        }
        return  minNumberIndex;
    }

}
