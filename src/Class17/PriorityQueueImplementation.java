package Class17;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new integerComparator());

        pq.add(20);
        pq.add(30);
        pq.add(10);
        pq.add(5);

        System.out.println(pq.peek()); // 5

        System.out.println(pq.remove()); // 5

        System.out.println(pq.remove()); // 10

        System.out.println(pq.remove()); // 20

    }

}

// using comparator
class integerComparator implements Comparator<Integer>{

    public int compare(Integer a,Integer b){
        if (a < b){
            return 1;
        }
        else if(a>b){
            return -1;
        }
        else
            return 0;
    }

}
