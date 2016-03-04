package com.yeapin.java;
/**
 * 测试继承
 * @author Jet
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
//		Manager manager= new Employee();//错误写法
		Employee employee = new Manager();
		Employee[] employees = new Employee[10];
		Manager[] managers = new Manager[10];
		employees[0] = managers[0];
//		managers[0] = employees[0];
		
	}
}
