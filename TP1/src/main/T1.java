package main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class T1 {

	public static void main(String[] args) {
	   
		System.out.println("Hello -- I am executing min ");
       System.out.println(min(10,5));	
	}
	
	public static int min(int a,int b){
		if (a==b) return a;
		if ( a < b )
		return a;
		return b;
		} 
	
	@Test
		public void testMin() {
		assertEquals(5, min(5,5));					
		}
}
