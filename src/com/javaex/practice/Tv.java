package com.javaex.practice;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
		
	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	
	
	//메소드-g
	public int getChannel() {
		if(this.channel>=1 && this.channel<=225) {
			return channel;
			
		}else {
			return 50;
		}
	}


	public int getVolume() {
		if(this.volume<0 || this.volume> 100) {
			return this.volume = 55;
			
		}else {
			return volume;
		}
	}


	public boolean isPower() {
		return power;
	}

	
	//메소드-일반
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		System.out.println("channel:" + this.getChannel());
	}
	public void channel(boolean up) {
		if(up == true) {
			channel = this.channel +1;
			System.out.println("channel:"+channel);
		}
	}
	
	public void volume(int volume) {
		System.out.println("volume:" + this.volume);
	}
	public void volume(boolean up) {
		if(up == true) {
			volume = this.getVolume()+1;
			System.out.println("볼륨:"+volume);
		}
	}
	public void status() {
		System.out.println("power:" + this.power );
		System.out.println("channel:"+ this.channel);
		System.out.println("volume:" + this.volume);
	}
}
