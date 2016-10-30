import java.io.*;
import java.util.Stack;


public class MyQueue<T>
{

	Stack<T> newstuff,oldstuff;


	
	public MyQueue()
	{
		newstuff = new Stack<T>();
		oldstuff = new Stack<T>();
	}

	public void enqueue(T x)
	{
		newstuff.push(x);
	}


	public int size()
	{
		return (oldstuff.size() + newstuff.size());
	}

	public T dequeue()
	{
		shift();
		return oldstuff.pop();
	}

	public T peek()
	{
		shift();
		return oldstuff.peek();
	}


	public void shift()
	{
		if(oldstuff.isEmpty())
		{
			while(!newstuff.isEmpty()) 
			{
				oldstuff.push(newstuff.pop());
			}
		}
	}






	public static void main(String[] args) 
	{
		MyQueue<Integer> q = new MyQueue<Integer>();

		q.enqueue(1);
		q.enqueue(2);

		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.size());


	}
}



/*
OUTPUT : 


Somdeep@HP MINGW64 ~/Desktop/Code (master)
$ javac MyQueue.java

Somdeep@HP MINGW64 ~/Desktop/Code (master)
$ java MyQueue
1
1
2
1



*/