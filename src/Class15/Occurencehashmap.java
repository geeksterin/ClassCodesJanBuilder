package Class15;

import java.util.HashMap;
import java.util.Set;

public class Occurencehashmap {

    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {1,2,3,1,2,3,1,4,5,6,7};

        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i]) == false){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }

        //print the hashmap
        Set<Integer> s = hm.keySet();
        for (int i: s) {
            System.out.println(i + " --> " + hm.get(i));
        }



    }

}
