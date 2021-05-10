package Class18;

import java.util.PriorityQueue;

public class TopKElements {

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {10,7,8,9,1,5,11,13,20};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i < arr.length ; i++){
            if(pq.size() < k){
                pq.add(arr[i]);
            }
            else{
                if(pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while (pq.isEmpty() == false){
            System.out.print(pq.remove() + " ");
        }
    }

}
