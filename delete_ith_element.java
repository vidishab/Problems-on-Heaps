import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class delete_ith_element {
    static public Object[] adjust(Object[] arr,int k)
    {
        for(int i=k;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        return arr;
    }
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq1= new PriorityQueue<Integer>();
        System.out.println("Enter the element to be deleted");
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        pq.add(7);
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        Iterator it = pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        Object[] arr=pq.toArray();
        for(int i=0;i<arr.length;i++)
        {
            if(i==p)
            {
                System.out.println("Element found" + arr[i]);
                arr=adjust(arr,i);
            }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            //System.out.println(arr[i]);
            int m = (int)arr[i];
            pq1.add(m);
        }
        Iterator it1 = pq1.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}

