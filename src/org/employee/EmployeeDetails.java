package org.employee;

public class EmployeeDetails { // body or block of the class
	
	// private -> access specifier
	// void    -> return type of the given method
	// empName -> method name
	// ()      -> arguments place / input or parameter place
	// {}      -> body or block of the method
	private void empName() {
		// implementation details or business logic
		// double quotes "" -> String: predefined class
		System.out.println("Employee name Anand");
	}
	
	private void empId() {
		System.out.println("employee id: 1122");
	}
	
	private void empMobile() {
		System.out.println("mobile: 8939278836");
	}
	
	// needed methods
	public static void main(String[] args) {
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empId();
	}
	

}
