package com.yeapin.java;
/**
 * 构造器重载、方法重写
 * @author Jet
 *
 */
public class Student {
	private String name;
	private int age;
	/**
	 * 这个是构造器
	 * 构造器类似于橡皮泥的模子
	 * 1、构造器与类同名
	 * 2、构造器没有返回值
	 * 3、构造器的参数≥0
	 * 4、每个类可以有1个或1个以上构造器
	 * 5、构造器总是伴随new一起调用
	 */
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Student(){}
	
}
