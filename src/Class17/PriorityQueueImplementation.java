package Class17;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(20);
        pq.add(30);
        pq.add(10);
        pq.add(5);


        //10 -- 20
        System.out.println(pq.peek());

        System.out.println(pq.remove());

        System.out.println(pq.peek());


    }

}
