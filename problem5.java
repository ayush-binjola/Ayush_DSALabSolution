package com.labproblems;
import java.util.Scanner;
import java.util.Stack;

public class problem5 {
	
	static boolean isbalance(String data) 
	{
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
				continue;
			}
			if(st.isEmpty())
				return false;
			
			char check;
			switch(ch)
			{
			case '}':
				check = st.pop();
				if(check == '[' || check == '(')
					return false;
				break;
			case ']':
				check = st.pop();
				if(check == '{' || check == '(')
					return false;
				break;
			case ')':
				check = st.pop();
				if(check == '[' || check == '{')
					return false;
				break;
			}
		}
		return (st.isEmpty());
	} 
	
	public static void main(String args[])
	{
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the Input data");
		String data = sc.next();
		System.out.println("Your input is " + isbalance(data));
		
	}
		
}	


