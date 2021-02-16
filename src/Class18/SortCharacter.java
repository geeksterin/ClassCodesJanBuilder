package Class18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortCharacter {

    public static void main(String[] args) {
        Character[] chracterArr = {'a','b','e','d','c'};
        Arrays.sort(chracterArr,new Comp());
        for (int i = 0; i < chracterArr.length ; i++) {
            System.out.print(chracterArr[i] + " ");
        }
    }
}

class Comp implements Comparator<Character> {
    public int compare(Character a,Character b){
        if (a > b){
            return -1;
        }
        else if(a < b){
            return 1;
        }
        else return 0;
    }
}
