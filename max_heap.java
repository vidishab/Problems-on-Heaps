import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class max_heap {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq.add(7);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        //System.out.println(pq.peek());
        Iterator it = pq.iterator();
        System.out.println("Maximum Queue");
        while(it.hasNext())
        {
            System.out.println(pq.poll());
        }
        System.out.println("Minimum Queue");
        pq1.add(7);
        pq1.add(3);
        pq1.add(6);
        pq1.add(1);
        pq1.add(2);
        pq1.add(4);
        //System.out.println(pq.peek());
        Iterator it1 = pq1.iterator();
        while(it1.hasNext())
        {
            System.out.println(pq1.poll());
        }
    }


}

