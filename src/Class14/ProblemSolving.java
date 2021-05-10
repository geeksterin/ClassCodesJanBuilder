package Class14;

import java.util.Scanner;

public class ProblemSolving {


    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // iterate over the string
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            // get the character
            char ch = str.charAt(i);
            // find value of character
            //checking number is alphabet or not
            if(ch>='A' && ch<='Z'){
                value = value + (ch-'A');
            }
            else{
                value = value + (ch-'0');
            }
            // add in a variable
        }

        System.out.println(value);
    }

}
