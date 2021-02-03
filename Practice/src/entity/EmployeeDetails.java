package entity;

public class EmployeeDetails {
	
	private int id,yoe;
	private String name,designation;
	private float salary;

	public EmployeeDetails(String ename, int eid, String edesignation, float esalary, int yoe) {
		
		name=ename;
		id=eid;
		salary=esalary;
		designation=edesignation;
		this.yoe=yoe;
		
	}

	public int getId() {
		return id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EmployeeDetails other = (EmployeeDetails) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", yoe=" + yoe + ", name=" + name + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}

	
}
