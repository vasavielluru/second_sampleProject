package service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Interface1.EmployeeInterface;
import entity.EmployeeDetails;
import exceptions.MyException;

public class EmployeeService implements EmployeeInterface {

	static Scanner obj=new Scanner(System.in);
	
	
	public static int displayMenu() {
	
		System.out.println("---------------\nMenu");
		System.out.println("1. Add Employee Details:");
		System.out.println("2. Update Employee Salary ");
		System.out.println("3. Delete an Employee Details");
		System.out.println("4. Display an employee based on ID");
		System.out.println("5. Display all Employees:");
		System.out.println("------------------\nChoose an option from the above menu");
		int ch=obj.nextInt();
		
		return ch;
	}

	


	
	public  List<EmployeeDetails> addEmployee(List<EmployeeDetails> workers) {
		System.out.println("Enter ID of Employee:");
		int eid=obj.nextInt();
		for(EmployeeDetails employee:workers)
		{
			try
			{
			
		if(employee.getId()==eid)
			throw new MyException("EmployeeId"+eid+" is already present");		
		else
		{
		System.out.println("Enter name of Employee:");
		String ename=obj.next();
		
		System.out.println("Enter the designation of employee:");
		String edesignation=obj.next();
		System.out.println("Enter the salary of employee:");
		float esalary=obj.nextFloat();
		System.out.println("Enter the number of years of experience that the employee has:");
		int yoe=obj.nextInt();
		workers.add(new EmployeeDetails(ename,eid,edesignation,esalary,yoe));
		}
		}
		
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		}
		return workers;
	}

	@Override
	public List<EmployeeDetails> updateEmployeeSalary(List<EmployeeDetails> workers2) {
		
		System.out.println("Enter the ID of employee whose Details are to be updated:");
		int id=obj.nextInt(),f=0;
		
			
		for(EmployeeDetails employee:workers2)
		{
		if(employee.getId()==id)
		{
			f=1;
			if(employee.getDesignation().contains("Developer"))
			{
				employee.setSalary(employee.getSalary()+1000);
			}
			if(employee.getYoe()>10)
			{
				employee.setSalary(employee.getSalary()+5000);
			}
		}
		
		}
		try {
				if(f==0)
					throw new MyException("Id does not exist");
			}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		return workers2;
	}

	



	public int displaySubMenu() {
		System.out.println("------\nSubMenu\n1. Update Employee Salary by 1000 based on designaton");
		System.out.println("2. Update employee salary by 500 based on years of experience");
		System.out.println("--------\nEnter an option from the sub menu");
		int ch=obj.nextInt();
		
		
		return ch;
	}



	@Override
	public EmployeeDetails getEmployeeById(List<EmployeeDetails> workers) {
		EmployeeDetails emp=null;
		System.out.println("Enter the ID of employee whose Details are to be displayed:");
		int id=obj.nextInt();
		for(EmployeeDetails employee:workers)
		{try {
			if(employee.getId()==id)
			{
				emp=employee;
				System.out.println(employee);
			}
			else
				throw new MyException("Id does not exist");
		}
		catch (MyException e)
		{
			System.out.println(e.getMessage());
		}
			
			
		}
		
		return emp;
	}

	@Override
	public void getAllEmployee(List<EmployeeDetails> workers) {
		for(EmployeeDetails employee:workers)
		{
				System.out.println(employee);
			
		}
		
		
	}

	
	
	@Override
	public List<EmployeeDetails> deleteEmployee(List<EmployeeDetails> workers) {
		
		System.out.println("Enter the ID of employee whose Details are to be deleted:");
		int id=obj.nextInt();
		for(EmployeeDetails employee:workers)
		{
			if(employee.getId()==id)
			{
				workers.remove(employee);
			}
			
			
		}
		return workers;
		
	}





	

	
}
