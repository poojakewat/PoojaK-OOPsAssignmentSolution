package com.greatlearningoops.models;

public class AdminDepartment extends SuperDepartment{

	public AdminDepartment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String DepartmentName() {
		return " Welcome to Admin Department " ;
	}
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission" ;
	}
	@Override
	public String getWorkDeadline() {
		return "  Complete by EOD  ";
	}

}