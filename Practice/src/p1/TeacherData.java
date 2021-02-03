package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class TeacherData {
	 static Scanner obj=new Scanner(System.in);
	 static int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Teacher> set=new LinkedHashSet<Teacher>(); 
		 
		int k=1;
		do {
			char choice=displayMenu();
			goToSwitch(choice,set);
			
			
			
		}while(k!=0);

	}

	public static void goToSwitch(char choice,Set<Teacher> set) {
		switch(choice)
		{
		case 'a':
			System.out.println("Ënter the name of teacher:");
			String teacherName=obj.next();
			System.out.println("Enter subject of respective teacher:");
			String teacherSubject=obj.next();
			set.add(new Teacher(teacherName,teacherSubject));
			break;
		case 'b':
			Iterator<Teacher> itr=set.iterator();  
			for (Teacher tr : set) {  
				System.out.println(tr.getName()+" "+tr.getSubject());  
				}  
			break;
		}
		
		
	}

	public static char displayMenu() {
		System.out.println("MENU\na: Add teacher data");
		System.out.println("b: Display teacher details");
		System.out.println("\nSelect an option from the menu");
		char ch=obj.next().charAt(0);
		return ch;
	}


	}


