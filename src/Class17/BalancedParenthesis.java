package Class17;

import java.lang.reflect.Parameter;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String str = "{}[](())()[}";
        Stack<Character> s = new Stack<>();
        boolean isBalanced = true;
        for (int i = 0;i<str.length();i++){
            char element = str.charAt(i);
            if(element == '(' || element == '{' || element == '['){
                s.push(element);
            }
            else{
                if (s.isEmpty() == true){
                    //imbalance
                    isBalanced = false;
                    break;
                }
                else if(element == ')' && s.peek()=='('){
                    s.pop();
                }
                else if (element == '}' && s.peek()=='{'){
                    s.pop();
                }
                else if (element == ']' && s.peek() =='['){
                    s.pop();
                }
                else{
                    isBalanced = false;
                    break;
                    //imbalanced
                }
            }
        }

        if (isBalanced == true){
            System.out.println("Parenthesis is Balanced");
        }
        else {
            System.out.println("paranthesis is imbalanced");
        }

    }



}
