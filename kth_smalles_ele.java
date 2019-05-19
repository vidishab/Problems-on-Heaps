
import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_smalles_ele {
    public static void main(String args[])
    {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(7);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        int p = pq.size();
        int arr[]=new int[p];
        for(int i=0;i<p;i++)
        {
            int m = pq.poll();
            System.out.println(m);
            arr[i]=m;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kth value");
        int res=sc.nextInt();
        System.out.println(arr[res-1]);

    }
}

