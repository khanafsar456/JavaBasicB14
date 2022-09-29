package com.syntax.class01;

import java.util.Scanner;

public class C05T0301HW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		double number1=input.nextDouble();
		System.out.println("Please enter Second number");
		
		double number2=input.nextDouble();
		System.out.println("Enter the operator");
		char operator=input.next().charAt(0);
		double result = 0;
		
	switch (operator) {
	case '+':
		result = (number1 + number2);
		break;
	case '-':
		result = (number1 - number2);
		break;
	case '*':
		result = (number1 * number2);
		break;
	case '/':
		result = (number1 / number2);
		break;
		default:
			System.out.println("invalid operator");
			break;
	}
	System.out.println("The result from the operations is " +result);		
	
	}


	}


