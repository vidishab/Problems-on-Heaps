import java.util.Collections;
import java.util.PriorityQueue;

public class Problem_25_heaps {
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,3,1,9,7};
        int arr1[]={11,2,8};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
            pq1.add(arr1[i]);
        }
        System.out.println("Largest n pairs");
        while ( pq.size() > 0 && pq1.size() > 0)
        {
            System.out.println(pq.poll() + " and " + pq1.poll());
        }
    }
}

