import java.util.Scanner;
public class create_heap {
    Heap node;
    static class Heap
    {
        int array[];
        int count;
        int capacity;
        char heap_type;
        Heap(int c,char type)
        {
            count=1;
            capacity=c;
            heap_type=type;
            array=new int[capacity];
        }
    }
    public int leftchild(int pos)
    {
        if(pos < 0 || pos >= node.capacity)
            return -1;
        else
        {
            int i = (2*pos) + 1;
            System.out.println("H1");
            return node.array[pos];

        }
    }
    public int rightchild(int pos)
    {
        if(pos < 0 || pos >= node.capacity)
            return -1;
        else
        {
            int i = (2*pos) + 2;
            System.out.println("H2");
            return node.array[pos];
        }

    }
    public int parent(int pos)
    {
        if(pos < 0 || pos >= node.capacity)
            return -1;
        else
        {
            int i = (pos-1)/2;
            System.out.println("Parent:"+ node.array[pos]);
            return node.array[pos];
        }
    }
    public void heapify(int p)
    {
        int l,r,max=0,temp;
        l=leftchild(p);
        r=rightchild(p);
        System.out.println(node.array[l]);
        if(l!=-1 && node.array[l] > node.array[p])
            max=l;
        else
            max=p;
        if(r!=-1 && node.array[r] > node.array[p])
            max=r;
        if(max!=p)
        {
            temp=node.array[max];
            //System.out.println("Max value:" + temp);
            node.array[max]=node.array[p];
            node.array[p]=temp;
        }
        heapify(max);

    }
    public void insert(int data)
    {
        //node.count=co;
        node.array[node.count]=data;
        if(node.array[node.count] > parent(node.count))
        {
            System.out.println(node.array[node.count]);
            //heapify(node.array,node.count);
            heapify(node.count);
        }
        node.count++;
    }
    public void print()
    {
        for(int i=0;i<node.capacity;i++)
        {
            System.out.println(node.array[i]);
        }
    }
    public static void main(String args[])
    {
        create_heap heap = new create_heap();
        heap.node=new Heap(7,'>');
        heap.node.array[0]=-1;
        //heap.node.array[1]=1;
        //heap.node.array[2]=2;
        //int arr[]=new int[10];
        for(int i=1;i<6;i++)
        {
            System.out.println("Enter the element");
            Scanner sc = new Scanner(System.in);
            int data=sc.nextInt();
            heap.insert(data);
        }
        System.out.println("Printing elements");
        heap.print();
    }
}

