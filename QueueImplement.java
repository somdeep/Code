import java.io.*;
import java.util.*;



class QueueImplement {
  public static void main(String[] args) {
      
      Stack s = new Stack();
      Stack r = new Stack();
      MyQ q = new MyQ();
      
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      q.enqueue(3);
      System.out.println(q.dequeue());
      

      
  }
    
    
}
    
    

    class MyQ
    {
        Stack begin,rest;

        public MyQ()
        {
            begin = new Stack();
            rest = new Stack();
        }


        public void enqueue(int x)
        {
            //System.out.println("enters enqueue");
            int other,val;
            int count =0;

            //System.out.println("peek : " + rest.peek());

            if(rest.peek() == Integer.MIN_VALUE && begin.peek() == Integer.MIN_VALUE)
            {
                begin.push(x);
                return;
            }
            while((other=rest.pop())!=Integer.MIN_VALUE)
            {
                //System.out.println("Pop print" + other);
                begin.push(other);
                count++;
            }

            rest.push(x);
            int i = 0;
            while(i<count)
            {   
                val = begin.pop();
                rest.push(val);
                i++;

            }



        }


        public int dequeue()
        {
            //System.out.println("dequeue");
            int val = begin.pop();
            int other;

            if(val != Integer.MIN_VALUE)
            {
                other = rest.pop();
                if(other != Integer.MIN_VALUE)
                {
                    begin.push(other);
                }

            }


            return val;
            

        }
    }
    




    class Queue
    {
        Node front,rear;
        
        public void enqueue(int x)
        {
            if(front == null)
            {
                front = new Node();
                front.val = x;
                front.next=null;
                rear=front;
            }
            else
            {
                rear.next = new Node();
                rear=rear.next;
                rear.val = x;
            }
            
                        
        }
        
        
        public int dequeue()
        {
            
            if(front == null)
                return Integer.MIN_VALUE;
            else
            {
                int res = front.val;
                front=front.next;
                return res;
            }
                
            
        }
        
        
        
        
    }







    class Stack
{
    Node top;   
    
    
    public void push(int x)
    {
        Node n = new Node();
        n.val = x;
        
        if(top!=null)
        {
            n.next = top;
            if(n.val < top.min)
                n.min = n.val;
            else
                n.min = top.min;
        }
        else
            n.min = n.val;
        
            top = n;
    } 
    
    public int pop()
    {
        if(top!=null)
        {
            int value = top.val;
            top=top.next;
            return value;
        }
        
        return Integer.MIN_VALUE;
        
    }
        
    public int peek()
    {
        if(top != null)
        {
            return top.val;
        }
        
        return Integer.MIN_VALUE;
    }
    
    public int min()
    {
        if(top != null)
        {
            return top.min;
        }
        
        return Integer.MIN_VALUE;
    }
    
}




class Node
{
    int val;
    Node next;
    int min;
}

     


