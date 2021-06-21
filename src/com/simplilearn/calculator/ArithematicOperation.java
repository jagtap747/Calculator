package com.simplilearn.calculator;

final class ArithematicOperation {
	   float number1;
	   float number2;
	   char choice;
	   private double result;
	
	  
	public void Calculate(float number1, float number2,char choice) {
		
		this.number1 = number1;
		this.number2 = number2;
		switch(choice) {
		
        case '+': result = number1 + number2;
        	System.out.println("Addition of "+number1+" and "+number2+"is :"+result);
           break;
       
        case '-': result = number1 - number2;
        System.out.println("Substraction of "+number1+" and "+number2+"is :"+result);    break;
        
        case '*': result = number1 * number2;
        System.out.println("Multiplication of "+number1+" and "+number2+"is :"+result);   break;
        
        case '/': result = number1 / number2;
        System.out.println("Division of "+number1+" and "+number2+"is :"+result);   break;
        
        default: System.out.printf("Error! Please Enter correct operator");
        
        return;
     }
		
	}
	
	
}
