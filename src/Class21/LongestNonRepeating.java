package Class21;

import java.util.HashSet;

public class LongestNonRepeating {

    public static void main(String[] args) {
        String str = "abcadcbeb";
        int maxlength = 0;
        int start = 0;
        int end =0;
        HashSet<Character> hs = new HashSet<>();
        while (end != str.length()){
            if (hs.contains(str.charAt(end)) == false){
                hs.add(str.charAt(end));
                end++;
            }
            else{
                maxlength = Math.max(maxlength,hs.size());
                while (hs.contains(str.charAt(end))){
                    hs.remove(str.charAt(start));
                    start++;
                }
                hs.add(str.charAt(end));
                end++;
            }
        }

        System.out.println(maxlength);


    }

}
