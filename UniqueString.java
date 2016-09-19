// Implement an algorithm to determine if a string has all unique characters. What
// if you cannot use additional data structures?

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class UniqueString
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		String s;
		System.out.println("Enter String to be checked");
		s=sc.nextLine();
		int i,j,len;
		len=s.length();
		char ch;
		for (i=0;i<len ;i++ ) 
		{
			ch=s.charAt(i);

			if(hm.containsKey(ch))
			{
				System.out.println("Not Unique String");
				System.exit(0);
			}

			else
			{
				hm.put(ch,1);
			}
			
		}

		System.out.println("Unique String");

	}
	
}