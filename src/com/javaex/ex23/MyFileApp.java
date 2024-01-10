package com.javaex.ex23;

import java.io.IOException;

public class MyFileApp {
	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		
		//정상일때
//		String str = mf.read("c:/aaa.txt");
//		System.out.println(str);
		
		//예외처리가 잘 되었으나 처리방식이 원하는게 아님
//		String str = mf.read2("c:/bbb.txt");
//		System.out.println(str);
		
		try {
			mf.read3("c:/bbb.txt");
			
		} catch (IOException e) {
			System.out.println("can not find file");
		}
		
	
	}
}
