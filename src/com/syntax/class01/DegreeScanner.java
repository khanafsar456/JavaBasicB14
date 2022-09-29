package com.syntax.class01;

import java.util.Scanner;

public class DegreeScanner {
public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);

System.out.println("Diploma Completed? True/False");
boolean degree=scanner.nextBoolean();

if (degree) {
	System.out.println("Congratulation");
} 
 if (degree) {
	System.out.println("How much is your GPA");
	double gpa=scanner.nextDouble();
	
if (gpa>=3.5) 
	{
		System.out.println("You are eligible for scholarship");
	}else 
	{
		System.out.println("You should have studied harder");
	}
	
}else {
	System.out.println("Get a degree");


}





}
}