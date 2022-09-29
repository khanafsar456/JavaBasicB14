package com.syntax.class01;

import java.util.Scanner;

public class C05Task02HW {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);

/*
 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
 * Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
 */
System.out.println("Please enter your grade");
char grade=input.next().charAt(0);
String explanation;

switch (grade) {
case 'A':
	explanation="Excellent";
	break;
case 'B':
	explanation="Good";
	break;
case 'C':
	explanation="Average";
	break;
case 'D':
	explanation="bad";
	break;
	
	default:
		explanation="Not Acceptable";
		break;
}
System.out.println("Your grades are " +explanation);

	

	}

}
