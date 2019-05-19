import java.util.Collections;
import java.util.PriorityQueue;

public class merge_two_maxheaps {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(7);
        int p = pq.size();
        /*for(int i=0;i<p;i++)
        {
            System.out.println(pq.poll());
        }*/
        pq1.add(0);
        pq1.add(5);
        pq1.add(10);
        pq1.add(8);
        int q = pq.size();
        for(int i=0;i<q;i++)
        {
            int m = pq1.poll();
            pq.add(m);
        }
        int r = pq.size();
        for(int i=0;i<r;i++)
        {
            System.out.println(pq.poll());
        }
    }
}

