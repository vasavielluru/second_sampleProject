package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;

import entity.EmployeeDetails;
import service.EmployeeService;

public class EmployeeApp {
	
	 static Scanner obj=new Scanner(System.in);
	 

	public static void main(String[] args) {
		
		
		List<EmployeeDetails> workers=new ArrayList<>();
		 EmployeeService object=new EmployeeService();
		
		int p=1;
		do
		{
			int choice=EmployeeService.displayMenu();
			goToSwitch(choice,workers,object);
			
			
		}while(p!=0);
		

	}

	public static void goToSwitch(int choice,List<EmployeeDetails> workers,EmployeeService object) {
		
		switch(choice)
		{
		case 1:
			workers=object.addEmployee(workers);
			break;
		case 2:
			workers=object.updateEmployeeSalary(workers);
			break;
		case 3:
			workers=object.deleteEmployee(workers);
			break;
		case 4:
			object.getEmployeeById(workers);
			break;
		case 5:
			object.getAllEmployee(workers);
			break;
			
		}
		
	}

}
