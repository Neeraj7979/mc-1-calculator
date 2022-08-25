package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{	
		return num1+num2;
	}
	public int subtract(int num1, int num2)
	{	
		return num1-num2;
	}
	public int multiply(int num1, int num2)
	{	
		return num1*num2;
	}
	public int divide(int num1, int num2)
	{   int divide=0;
		//write the code and handle the ArithmeticException
		try {
			divide=num1/num2;
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
         return  divide;

	}
	public int modulo(int num1, int num2)
	{	
		return num1 % num2;
	}
}
