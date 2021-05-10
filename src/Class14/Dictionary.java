package Class14;

import java.util.HashMap;

public class Dictionary {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Instructor","teacher");
        hm.put("Understanding","clarifyng");
        hm.put("x","variable");

        System.out.println(hm.get("Instructor"));
        System.out.println(hm.get("x"));
        System.out.println(hm.get("y"));

    }
}

// complete the dictionary problem
// HW to find about hashmap
//    -- complexity of functions
// explore more function of hashmap