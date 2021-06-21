package com.simplilearn.calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// arithmetic calculator-four basic arithmetic operations (addition, subtraction, multiplication, and division).
		ArithematicOperation arith=new ArithematicOperation();
		
		Scanner reader = new Scanner(System.in);
	      System.out.print("Please Enter two numbers: \n");
	      
	      float num1 =  reader.nextFloat();
	      float num2 =  reader.nextFloat();
	      
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      char choice = reader.next().charAt(0);
		arith.Calculate(num1, num2, choice);
		
	}

}
