import java.util.*;

public class Main{
    public static void main(String [] args){
        int [] arr =  {1,21, 57, 92, 13, 43, 22, 21, 6};

        //create
        // PriorityQueue<Integer> pq = new PriorityQueue<>();          //default behaviour -- min PQ
        // for(int ele : arr)
        //     pq.add(ele);

        // while(pq.size() != 0){
        //     System.out.println(pq.peek());
        //     pq.remove();    // Remove all element one by one from ( min to max )
        // }




        //max Priority Queue    -> Since max priority queue banana paadta  hai
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());          //default behaviour -- min PQ
        for(int ele : arr)
            pq.add(ele);    //  add all ele in heap 

        while(pq.size() != 0){
            System.out.println(pq.peek());  // pq.peek it can be min value or max value in a heap
            pq.remove();  // Remove all element one by one from ( max to min )
        }

    }
}
