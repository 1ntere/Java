package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void EmployeeMenu() {
		System.out.println("======= ���� ���� ��� =======");
		for (Employee e : ssm.printEmployee()) {
			System.out.println(e.inform());
		}
		
		System.out.println("======= ���� ���� ��� =======");
		System.out.println("���� ���� �հ� : "+ssm.sumScore());
	}
}
