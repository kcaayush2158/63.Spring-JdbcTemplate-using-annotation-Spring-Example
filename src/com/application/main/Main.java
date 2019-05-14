package com.application.main;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.model.Employee;
import com.application.service.EmployeeService;
import com.application.service.impl.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	 EmployeeService employeeService = context.getBean("employeeService",EmployeeServiceImpl.class);
		/*		       
		 * Employee employee = new Employee();
		 * employee.setEmail("aayushkc2158@gmail.com"); employee.setEmployeeId(1);
		 * employee.setEmployeeName("aayush kc"); employee.setGender("male");
		 * employee.setSalary(2000.00);
		 */
	 
		// employeeService.updateEmployeeEmailById("aayushkc2158@hotmail.com", 2);
	 	// employeeService.deleteEmployeeById(1);
	 
	List<Employee> employeeList = employeeService.getAllEmployeesInfo();
	for(Employee emL : employeeList) {
		
		System.out.println(emL.getEmployeeId()+"\t"+emL.getEmployeeName()+"\t"+emL.getEmail()+"\t"+emL.getGender()+"\t"+emL.getSalary());
	}
	 context.close();
	 
	}
	
	

}
