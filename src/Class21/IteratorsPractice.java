package Class21;

import java.util.HashMap;
import java.util.HashSet;

public class IteratorsPractice {

    public static void main(String[] args) {

        // hashset
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(10);
//        hs.add(20);
//        hs.add(1);
//        hs.add(30);
//
//        for( int i : hs){
//            System.out.println(i);
//        }

        // hashmap
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(7,"Seven");
        hm.put(5,"FIve");

        for( int key: hm.keySet()){
            System.out.println(key + " : " + hm.get(key));
        }




    }


}
