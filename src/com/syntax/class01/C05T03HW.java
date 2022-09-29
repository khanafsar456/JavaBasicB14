package com.syntax.class01;

import java.util.Scanner;

public class C05T03HW {

	public static void main(String[] args) {
	/* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
	 * Based on operator provide the result to user. 
	 * Please complete this assignment in 2 ways: using if statement and switch case. 
	 */
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter first number");
	double number1=input.nextDouble();
	System.out.println("Please enter Second number");
	double number2=input.nextDouble();
	System.out.println("Enter the operator");
	char operator=input.next().charAt(0);
	
	
if (operator == '+') {
	System.out.println("Sum result is " + (number1+number2));
} else if (operator == '-') {
	System.out.println("Subtraction result is " + (number1-number2) );
} else if (operator == '*') {
	System.out.println("Multiplication result is " + (number1*number2) );
} else if (operator == '/') {
	System.out.println("Division result is " + (number1/number2) );
}




}

}
