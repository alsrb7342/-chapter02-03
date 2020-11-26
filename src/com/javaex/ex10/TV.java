package com.javaex.ex10;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	
	//�⺻������ �ʿ����
	
	//������
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

	
	//�Ŀ�����
	public void power(boolean on) {
		this.power = on;
	}
	
	
	//�������� (0~100)
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
	
	//���� on / down
	public void volume(boolean up) {
		if(up == true) {
			volume(this.volume+1); 
		}
		else {
			volume(this.volume-1);
		}
	}
	
	//ä�ΰ���(1~255)
	public void channel(int channel) {
		if(power == true) { 
			if(channel < 1  || channel > 255) { 
 				System.out.println("���� ä���Դϴ�.");
			}
			else {
				this.channel = channel;
			}
		}
	}
	
	//ä�� up / down
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		}
		else {
			channel(this.channel-1);
		}
	}
			
	

	//�Ϲ� �޼ҵ�
	public void status() {
		System.out.println("ä��:" + channel+ "    ����:" + volume + "    ����:" + power);
	}


	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	

}
