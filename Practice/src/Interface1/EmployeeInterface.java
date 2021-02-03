package Interface1;

import java.util.List;
//import java.util.Set;

import entity.EmployeeDetails;



public interface EmployeeInterface {
	
		 public List<EmployeeDetails> addEmployee(List<EmployeeDetails> workers);
		public List<EmployeeDetails> updateEmployeeSalary(List<EmployeeDetails> workers);
		public EmployeeDetails getEmployeeById(List<EmployeeDetails> workers);
		void getAllEmployee(List<EmployeeDetails> workers);
		public List<EmployeeDetails> deleteEmployee(List<EmployeeDetails> workers);
		
		
		

	


}
