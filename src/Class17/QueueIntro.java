package Class17;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("Bittoo");
        q.add("karthikeyan");
        q.add("Arun");

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }

}
