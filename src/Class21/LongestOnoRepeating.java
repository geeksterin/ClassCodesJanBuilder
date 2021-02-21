package Class21;

import java.util.HashSet;



public class LongestOnoRepeating {

    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        String str = "abcadcbeb";
        int maxlength = 0;
        for (int i = 0;i< str.length();i++){
            HashSet<Character> hs = new HashSet<>();
            for (int j = i;j<str.length();j++){
                if (hs.contains(str.charAt(j))){
                    //tell me your size
                    maxlength = max(maxlength,hs.size());
                    break;
                }
                else{
                    hs.add(str.charAt(j));
                }
            }
        }
        System.out.println(maxlength);
    }

}
