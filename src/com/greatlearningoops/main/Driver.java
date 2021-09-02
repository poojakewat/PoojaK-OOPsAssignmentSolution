package com.greatlearningoops.main;
import com.greatlearningoops.models.AdminDepartment;
import com.greatlearningoops.models.HrDepartment;
import com.greatlearningoops.models.TechDepartment;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HrDepartment hr = new HrDepartment();
		AdminDepartment ad = new AdminDepartment();
		TechDepartment td = new TechDepartment();

		System.out.println(ad.DepartmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("---------------------");
		System.out.println("---------------------");

		System.out.println(hr.DepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("---------------------");
		System.out.println("---------------------");


		System.out.println(td.DepartmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		System.out.println("---------------------");
		System.out.println("---------------------");


	}

}
