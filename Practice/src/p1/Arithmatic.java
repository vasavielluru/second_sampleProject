package p1;

import java.util.Scanner;

public class Arithmatic {
	static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		int a=obj.nextInt(),b=obj.nextInt(),k=1;
		do {
			int choice=displayMenu();
			GoToSwitch(choice,a,b);
		}while(k!=0);

	}

	public static void GoToSwitch(int choice, int a, int b) {
		switch(choice)
		{
		case 1:
			add(a,b);
			break;
		case 2:
			sub(a,b);
			break;
		case 3:
			multiply(a,b);
			break;
		case 4:
			try {
			div(a,b);
			}
			catch(Exception e)
			{
				System.out.println("Arithmatic Exception");
			}
			finally {
			System.out.println("hia");}
			break;
		case 5:
			System.exit(0);
		}
		
	}

	public static void div(int a, int b) {
		System.out.println("The remainder is:"+(a/b));
		
	}

	public static void multiply(int a, int b) {
		System.out.println("The product of two numbers is:"+(a*b));
		
	}

	public static void sub(int a, int b) {
		System.out.println("The Substraction is:"+(a-b));
		
	}

	public static void add(int a, int b) {
		System.out.println("The Sum is:"+(a+b));
		
	}

	public static int displayMenu() {
		System.out.println("Menu:\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Exit\nSelect an option from Menu");
		int ch=obj.nextInt();
		return ch;
	}

}
