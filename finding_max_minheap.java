import java.util.Iterator;
import java.util.PriorityQueue;

public class finding_max_minheap {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(7);
        pq.add(10);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        /*Iterator it = pq.iterator();
        while (it.hasNext())
        {
            System.out.println(pq.poll());
        }*/
        Object[] arr= pq.toArray();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int p = (int)arr[i];
            max=Math.max(p,max);
        }
        System.out.println(max);
    }
}

