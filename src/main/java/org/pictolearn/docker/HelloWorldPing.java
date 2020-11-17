package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 150; i++){
			System.out.println("Hello Thilok :  " + i );
			Thread.sleep(1000);
		}
	}
}
