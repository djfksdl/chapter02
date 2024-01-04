package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("좋은날" ,"아이유" ,"Real","이민수",2010);
		s1.setTrack(3);
		System.out.println(s1.toString());
		
		Song s2 = new Song("거짓말" ,"BIGBANG" ,"Always","DRAGON",2007,2);
		System.out.println(s2.toString());
		
		Song s3 = new Song("벚꽃엔딩" ,"버스커버스커" ,"버스커버스커","장범준",2012);
		s3.setTrack(4);
		System.out.println(s3.toString());
		


		

	}

}
