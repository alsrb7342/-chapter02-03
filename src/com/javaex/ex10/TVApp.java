package com.javaex.ex10;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV(7, 20, false);  	
        
		System.out.println(tv.toString());	
        
		//���� 100Ȯ��
        tv.power( true );
        tv.volume( 120 );
        System.out.println(tv.toString());		          
        
        //���� -1
        tv.volume( false );
        System.out.println(tv.toString());
        
        //���� ä��
        tv.channel( 0 );
        System.out.println(tv.toString());		          
        
        //ä�� +3
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        System.out.println(tv.toString());

        //�Ŀ� off
        tv.power( false );
        System.out.println(tv.toString());  

	}

}
