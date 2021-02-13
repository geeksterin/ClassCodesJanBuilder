package class13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomStack {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<5;i++) {
            queue.add(i);
        }
        System.out.println("########## func ############");
        System.out.println(queue.poll()); //removes 1st
        System.out.println(queue.peek()); //sees 1st
        System.out.println(queue.isEmpty());
    }
}

//1, 2, 3, 4, 5