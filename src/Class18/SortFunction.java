package Class18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortFunction {

    public static void main(String[] args) {

        Integer[] arr = {1,4,3,2,5,6,7,8,10};
        Arrays.sort(arr,new integerComparator());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }


    }

}


class integerComparator implements Comparator<Integer> {

    public int compare(Integer a,Integer b){
        if (a < b){
            return 1;
        }
        else if(a>b){
            return -1;
        }
        else
            return 0;
    }

}

