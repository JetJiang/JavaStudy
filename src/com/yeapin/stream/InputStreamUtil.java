package com.yeapin.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 从键盘读取输入流
 * InputStream是超级抽象类，负责字节流的输入
 * Reader是超级抽象类，负责字符流的输入
 * @author jiangjunjie
 *
 */
public class InputStreamUtil {
	/**
	 * 打印键盘输入——方法一
	 * @throws IOException
	 */
	public void readFromBoard1() throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		char[] chars = new char[1024];
		int length;
		while((length = in.read(chars))>1){
			System.out.println(new String(chars,0,length));
		}
		in.close();
	}
	/**
	 * 读取键盘输入——方法二
	 * @throws IOException
	 */
	public void readFromBoard2() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str=reader.readLine())!=""){
			System.out.println(str);
		}
		reader.close();
	}
	/**
	 * 键盘输入控制台打印——方法三
	 */
	public void readFromBoard3 (){
		Scanner scanner = new Scanner(System.in);
		String str = "";
		while((str=scanner.nextLine()).length()>0){
			System.out.println("*"+str+"*");
		}
		scanner.close();
	}
	
}
