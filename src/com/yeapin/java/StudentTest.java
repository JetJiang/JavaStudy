package com.yeapin.java;
/**
 * 测试入口
 * @author Jet
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("张三", 10);
		student.test();
		Student student2 = new Student("李四", 11);
		student2.test();
	}
}
