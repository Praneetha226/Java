package xyza;

import java.io.Console;
import java.lang.*;

public class Sample {
	// create a method
	public int multiply(int a, int b, int c){
		int result = a*b*c;
		return result;
	}
	public static void main(String [] args){
	int a = 10, b , c ; // variables declaration
	b = 20 ; c =30; // initialization
	
	final int money = 100 ; // constant declaration
	System.out.println("Addition of a, b iASsASZs " +(a+b));
	System.out.println(money);
	
	System.out.println("ALKSHJSAM,N");
	System.out.println(c);
	//Conditional blocks
	/*if (a >b){
		System.out.println("A is a big number");
	}
	else
	{
		System.out.println("B is a big number");
	}*/
	// Loop Block
	for( int d=1; d<=5; d++){
		System.out.println(d);
	
	}
	// create objects and access methods
	Sample obj = new Sample();
		int z = obj.multiply(10, 20, 3);
	
	System.out.println(z);
	
	}
}
