//Java program to demonstrate constructors and static methods for pop and push.
//Aakanxa Modha
//January 29, 2024
//230970031

import java.util.*;

class Stack
{
	int n, top;
	int arrSt[] = new int[50];

	Stack()
	{
		top = -1;
	}

	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements(max 50): ");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			if(sc.hasNextInt())
			{
				arrSt[i] = sc.nextInt();
			}
		}
		top = n-1;
	}

	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Top most element is popped out.");
		top--;

		System.out.println("The elements after popping:-");
		for(int i=top; i >= 0; i--)
			System.out.println(arrSt[i]);
	}

	public void push(int ele)
	{
		if(top == arrSt.length - 1)
		{
			System.out.println("Stack overflow.");
			return;
		}

		top++;
		arrSt[top] = ele;
		System.out.println("The element has been pushed.");

		System.out.println("The elements after pushing:-");
		for(int i = top; i>=0; i--)
		{
			System.out.println(arrSt[i]);
		}
	}

	public static void pop(Stack s)
	{
		s.pop();
	}

	public static void push(Stack s, int ele)
	{
		s.push(ele);
	}

	public static void main(String args[])
	{
		Stack s = new Stack();

		int choice = -1;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Enter the number of elements: ");
			System.out.println("2. Pop");
			System.out.println("3. Push");
			System.out.println("Enter your choice (0 to stop): ");
			if (sc.hasNextInt())
			{
				choice = sc.nextInt();
				switch(choice)
				{
      					case 1: s.getData();
      						break;

					case 2: s.pop(s);
						break;

					case 3:	System.out.println("Enter the element you want to push:");
						int element = sc.nextInt();
    						push(s, element);

    					case 0: System.out.println("Exit..!");
    						break;

    					default: System.out.println("Enter a valid number: ");
    						 break;
				}
			}
		}while(choice != 0);
	}
}
