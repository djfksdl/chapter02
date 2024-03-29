package com.javaex.ex10;

public class Tv {
	// 필드

	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv() {
		
	}
	public Tv(int channel, int volume , boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	// 메소드-gs : getter만 작성
	public int getChannel() {//조건이 작동안하는 이유는 getChannel이라는 이름이 동일하지 않아서임! 쓸려면 channel이 아니라 getChannel로 써줘야한다. 알아서 인식되지 않음!
//		if(channel<=1 || channel>=255) {
//			return 50;
//		}else {
//			
//		}
		return channel;
	}

	public int getVolume() {
//		if(this.volume>=0 && this.volume<=100) {
//			return this.volume;				
//		}else {
//			return 0;
//		}
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	// 메소드-일반
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if(channel<1 || channel>255) {
			this.channel = 200;
		}else {
			this.channel = channel;			
		}
	}
	public void channel(boolean up) {
		if(up == true) {
			this.channel = channel +1;
		}else {
			this.channel = channel -1;
		}
		System.out.println("채널: " + this.channel);//getChannel을 써보면 get에서 쓴 범위 적용 가능할듯??
	}
	
	public void volume(int volume) {
		if(volume<0 || volume>100) {
			this.volume = 100;
		}else {
			this.volume = volume;			
		}
//		System.out.println("볼륨: " + volume);
	}
	public void volume(boolean up) {
		if(up == true) {
			this.volume = volume +1;
		}else {
			this.volume = volume -1;
		}
//		System.out.println("볼륨: " + this.volume);
	}
	
	public void status() {
		System.out.println("전원: " + this.power);
		System.out.println("채널: " + this.channel);
		System.out.println("볼륨: " + this.volume);
	}
	
	
}
