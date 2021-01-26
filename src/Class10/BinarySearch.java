package Class10;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,20};
        int numToFind = 20;
        int ansIndex = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == numToFind){
                ansIndex = mid;
                break;
            }
            else if(arr[mid] > numToFind){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(ansIndex);
    }

}



