package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if (num<=0){
			throw new CalculatorException("Number should not be negative or zero");
		}
		else {
			double decimal=num-(int)num;
			return num-decimal;
		}


	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if (num<=0){
			throw new CalculatorException("Number should not be negative or zero");
		}
		else {
			double decimal=num-(int)num;
			return num-decimal+1;
		}

	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if (num1<num2){
			throw new CalculatorException("num1 cannot less than num2");
		}
		else {
			return (long) Math.pow(num1,num2);
		}

    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
			//or else call sqrt method of Math class and return the value
		if (num<=0){
			throw new CalculatorException("Number should not be negative or zero");
		}
		else {
			return Math.pow(num,1/2);
		}

    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			double result1=scientificCalculator.cielOfANumber(10.34f);
			System.out.println("Result 1 = "+result1);

		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		 try {
			 double result2= scientificCalculator.floorOfANumber(12.877f);
			 System.out.println("Result = "+result2);
		 }
		 catch (CalculatorException e) {
			 throw new RuntimeException(e);
		 }
		 MathematicalCalculator m1=new MathematicalCalculator();
		 try {
			 int result3=m1.divide(10,0);
		 }
		 catch (ArithmeticException e){
			 System.out.println(e);
		 }
	}
}
