package com.javaex.ex10;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	
	//기본생성자 필요없음
	
	//생성자
	public TV(int channel, int volume, boolean power) {
		this.power = power;
		this.volume = volume;
		this.channel = channel;
	}
	
	
	//getter     setter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	
	//파워관련
	public void power(boolean on) {
		this.power = on;
	}
	
	
	//볼륨관련 (0~100)
	public void volume(int volume) {
		if(power == true) { 
			if(volume < 0) {
				this.volume = 0;
			}
			else if(volume > 100) { 
			    this.volume = 100;
			}
			else {
			    this.volume = volume;
			}
		}
	}
	
	//볼륨 on / down
	public void volume(boolean up) {
		if(up == true) {
			volume(this.volume+1); 
		}
		else {
			volume(this.volume-1);
		}
	}
	
	//채널관련(1~255)
	public void channel(int channel) {
		if(power == true) { 
			if(channel < 1  || channel > 255) { 
 				System.out.println("없는 채널입니다.");
			}
			else {
				this.channel = channel;
			}
		}
	}
	
	//채널 up / down
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		}
		else {
			channel(this.channel-1);
		}
	}
			
	

	//일반 메소드
	public void status() {
		System.out.println("채널:" + channel+ "    볼륨:" + volume + "    전원:" + power);
	}


	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	

}
