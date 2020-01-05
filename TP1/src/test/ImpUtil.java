package test;

import main.util;

public class ImpUtil implements util {

	@Override
	public double prod(double x, double y) {
		return x*y;
	}

	
	@Override
	public double div(double x, double y) {
		if (y==0)
			throw new ArithmeticException("/ by zero");
		else
		return x/y;
	}

	
	@Override
	public double addition(double x, double y) {
		return x+y;
	}

	
	@Override
	public double soustr(double x, double y) {
		return x-y;
	}

	
	@Override
	public int PGCD(int a, int b) {
		while (a != b) {         
			if (a < b)            
				b = b - a;        
			else            
				a = a - b;      
			}      return a;
	}

	
	@Override
	public int Fact(int a) {
		if (a<0)
			throw new IllegalArgumentException(" negative number for factoriel");
		else if (a==0) return(1);		
	    else return(a*Fact(a-1));	}

	
	@Override
	public String bin(int a) {
		return Integer.toBinaryString(a);
	}
	
	@Override
	public boolean estPair(int a) {
		if (a%2 == 0)
			return true;
		else 
			return false;
	}

	
	

}
