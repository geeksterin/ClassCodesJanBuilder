package Class16;

import java.util.ArrayList;
import java.util.Stack;

public class recentGreaterElement {

    public static void main(String[] args) {
        int[] arr = {5,3,6,2,7,9,4,8};
        ArrayList<Integer> ans = new ArrayList<>();
        // create a stack
        Stack<Integer> s = new Stack<>();
        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            while (s.isEmpty()==false && s.peek()< arr[i] ){
                s.pop();
            }
            if(s.isEmpty() == true){
                ans.add(-1);
            }
            else{
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

        // complexity

            // we will try to find recent largest value
            //pop element untill you find number greater than you
            //or stack is empty
        // push the element


    }


}
