package Class15;

import java.util.HashMap;

public class firstrepeatingCharacter {

    public static void main(String[] args) {
        String s = "bittoo aggarwal";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                System.out.println(s.charAt(i) + " is first repeating character");
                break;
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }

    }


}
