package com.javaex.ex10;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV(7, 20, false);  	
        
		System.out.println(tv.toString());	
        
		//볼륨 100확인
        tv.power( true );
        tv.volume( 120 );
        System.out.println(tv.toString());		          
        
        //볼륨 -1
        tv.volume( false );
        System.out.println(tv.toString());
        
        //없는 채널
        tv.channel( 0 );
        System.out.println(tv.toString());		          
        
        //채널 +3
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        System.out.println(tv.toString());

        //파워 off
        tv.power( false );
        System.out.println(tv.toString());  

	}

}
