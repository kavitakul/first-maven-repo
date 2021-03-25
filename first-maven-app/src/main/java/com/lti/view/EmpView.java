package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(1002);
		emp.setEmpName("mark");
		System.out.println("emp id:"+emp.getEmpId());
		System.out.println("emp name:"+emp.getEmpName());
		
		
		

	}

}
