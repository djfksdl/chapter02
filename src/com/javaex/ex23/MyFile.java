package com.javaex.ex23;

import java.io.IOException;

public class MyFile {
	
	//필드
	//생성자 기본생성자
	//메소드-gs(필드가 없으니까 생략)

	//메소드-일반
	//정상적일때
	public String read(String path) {
		String result = "학교종이 땡땡땡 어서 모이자";//path에 있는 파일을 읽음(가정)
		
		return result;
	}
	
	//파일이 없는 경우 --> 만드는 쪽에서 처리 -> ex)만든걸 미국에서 사가서 한국어로 뭔소리야 할수있음. 불만족할 수 있음
	public String read2(String path) {
		
		String result = "";//path에 있는 파일이 없음(가정)
		
		try {
			//파일이 없는 상황을 강제로 발생
			throw new IOException();
			
		} catch (IOException e) {
			System.out.println("경로에 파일이 없습니다.");
		}
		
		return result;
	}
	
	//파일이 없는 경우 --> 사용하는 쪽에 알려줌
	public void read3(String path) throws IOException{ //던지면 main에서 처리해야함. 각나라 언어로 
		
		String result = "";//path에 있는 파일이 없음(가정)
		
		//파일이 없는 상황을 강제로 발생
		throw new IOException();
		
//		return result;
	}
	
}
