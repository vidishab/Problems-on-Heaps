import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class median_in_heap {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq.add(5);
        pq1.add(10);
        System.out.println("Enter the element");
        for(int i=0;i<6;i++)
        {
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();
            if(pq1.peek() > p)
            {
                pq.add(p);
            }
            else
            {
                pq1.add(p);
            }
        }
        int r1=pq.size();
        int r2=pq1.size();
        if(r1>r2)
        {
            System.out.println(pq.peek());
        }
        else
        {
            int res=(pq.peek() + pq1.peek())/2;
            System.out.println("Result:"+ res);
        }
        for(int i=0;i<r1;i++)
        {
            System.out.println(pq.poll());
        }
        for(int i=0;i<r2;i++)
        {
            System.out.println(pq1.poll());
        }
    }
}

