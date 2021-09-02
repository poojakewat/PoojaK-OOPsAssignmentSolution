package com.greatlearningoops.models;

public class TechDepartment extends SuperDepartment {

	public TechDepartment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String DepartmentName() {
		return " Welcome to Tech Department " ;
	}
	@Override
	public String getTodaysWork() {
		return " Complete coding of module 1" ;
	}
	@Override
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
	public String getTechStackInformation() {
		return " core Java ";
	}

}
