package Class12;

public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int elementToFind = 3;
        int lastIndexOfOccurence = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == elementToFind){
                lastIndexOfOccurence = mid;
//                end = mid-1;
                start = mid + 1;
            }
            else if (arr[mid]<elementToFind){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println(lastIndexOfOccurence);

    }

}
