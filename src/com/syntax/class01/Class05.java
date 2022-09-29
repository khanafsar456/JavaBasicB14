package com.syntax.class01;

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {


Scanner a=new Scanner(System.in);
System.out.println("How many Years of Work/Service");
int service=a.nextInt();

if (service >=5) {
System.out.println("Congratulation's! You're Eligible for the Bonus");


System.out.println("How much is your Anual Salary");
int anualSalary=a.nextInt();

if (anualSalary>50000){
	System.out.println("You're eligible for $5000 Bonus");
}else {
	System.out.println("You're eligible for $3000 Bonus");
}

}else {
System.out.println("Unfortunately, Yor're not Eligible for the Bonus");}



	}

}
