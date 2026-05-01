import java.util.Collection;
import java.util.PriorityQueue;

public class Pqueue {
    static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collection.reverseOrder());
        pq.add(92);                                     /*|-> */
        pq.add(100);                                    /*-> descending order/minheap*/
        pq.add(10);
        pq.add(20);
        pq.add(30);

        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}
