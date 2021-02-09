package Class15;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(10);
        ar.add(15);
        ar.add(2,20000);
        for (int i: ar) {
            System.out.println(i);
        }
    }

}
