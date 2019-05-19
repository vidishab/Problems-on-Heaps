import java.util.PriorityQueue;
import java.util.Stack;

public class implement_stack {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int c=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<10;i++)
        {
            s.add(c++,i);
            System.out.println("Pushing element " + i + "with priority " + c);
        }
        System.out.println(s.peek());
        while (!s.empty())
        {
            System.out.println(s.pop());
        }
    }
}

//LIFO is implemented with variable for priority
