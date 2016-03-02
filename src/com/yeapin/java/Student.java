package com.yeapin.java;
/**
 * 构造器重载、方法重写
 * 一、方法重载
 * 		一个类可以有多个构造器，在创建对象时使用不同的构造器，这种特征叫做重载；同样也适用于其他方法
 * 		方法的签名包括两部分——方法名和参数，方法名相同，参数不同就叫重载
 * 二、方法重写
 * 		方法重写又叫方法覆盖，指的是父类和子类之间的一种特征
 * 		要求返回值和签名完全一致，这叫方法重写
 * @author Jet
 *
 */
public class Student {
	//静态变量
	/**
	 * 静态域、静态方法是属于类，而不属于任何一个对象
	 */
	private static int count=1;
	//final变量
	private final String name;
	//静态常量
	public static final double PI = 3.1415926;
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
		//调用另一个构造器
		this(name);
		this.age = age;
		count++;
	}
	
	public Student(String name){
		this.name = name;
		System.out.println("构造方法被调用");
	}
	//不建议方法名这样写，容易和构造方法混淆
	public void Student(){
		System.out.println("执行Student方法");
	}
	
	public void test(){
		System.out.println("count值:"+count+"**name:"+name+"**age:"+age);
	}
	
}
