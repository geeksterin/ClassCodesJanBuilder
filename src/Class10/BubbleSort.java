package Class10;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        for (int i = 0;i<arr.length;i++){

            for(int j = 0;j<arr.length -1;j++){
                if(arr[j] < arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " " );
            }
            System.out.println();

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k] + " ");
        }
    }


}
