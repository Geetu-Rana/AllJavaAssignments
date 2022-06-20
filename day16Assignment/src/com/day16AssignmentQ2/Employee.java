package com.day16AssignmentQ2;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private double salary;
	
	Employee(){
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee id :"+empId+", Employee Name :"+empName+", Employee salary : "+salary;
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	@Override
	public int compareTo(Employee emp) {
		
		if(this.salary>emp.salary) {
			return +1;
		}else if(this.salary<emp.salary) {
			return -1;
		}else {
			return 0;
		}
		
	}
	public Employee(int id, String name, double salary){
		this.empName = name;
		this.empId = id;
		this.salary = salary;
	}
	
	
	
}
