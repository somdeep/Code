import java.io.*;
import java.util.*;



class MinStack {
  public static void main(String[] args) {
      
      Stack s = new Stack();
      
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(0);
      //System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.peek());
      System.out.println(s.min());
      System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.min());
      
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
