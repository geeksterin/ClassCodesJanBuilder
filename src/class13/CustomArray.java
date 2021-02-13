package class13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CustomArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(45);
        arr1.add(87);
        arr1.add(45);
        arr1.add(87);
        arr1.add(45);
        arr1.add(87);
        arr1.add(45);
        arr1.add(87);
        System.out.println(arr1.get(0));
        System.out.println(arr1.set(1, 76));
        System.out.println(arr1.size());
        System.out.println(arr1.contains(45));
        System.out.println(arr1.remove(2));
        System.out.println("##############################################################");
        Collections.sort(arr1);
        for(Integer a : arr1) {
            System.out.println(a);
        }
    }
}
//1,2,3,4,5 -- temp
//1,2,3,4,5,22 -- arr
