package com.javaex.ex05;

public class Song {
	// 필드
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	// 생성자
	// 메소드-gs
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getComposer() {
		return this.composer;
	}
	public int getYear() {
		return this.year;
	}
	public int getTrack() {
		return this.track;
	}
	// 메소드-일반
	
	public void showIfo() {
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track +"번 track, " + composer + "작곡 )");
	}
	
}
