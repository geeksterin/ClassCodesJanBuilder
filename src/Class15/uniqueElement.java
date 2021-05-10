package Class15;

import java.util.HashSet;

public class uniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,1,1,1,2,3,7,8,9,10};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i: hs) {
            System.out.print(i + " ");
        }
    }
}
