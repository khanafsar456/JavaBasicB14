package com.syntax.class01;

import java.util.Scanner;
public class ScannerHW {

	public static void main(String[] args) {
Scanner a=new Scanner(System.in);
System.out.println("Mortgage Rate");
double mortgageRate=a.nextDouble();


if (mortgageRate>4.5) {
	System.out.println("Not to buy house");
}else {
	System.out.println("Buy a House");
}
System.out.println("Buy a House? True or False");
boolean buyHouse=a.nextBoolean();

System.out.println("House Price");
int mortagePrice=a.nextInt();



if (mortagePrice>20000) {
	System.out.println("Borrow Loan");
}else {
	System.out.println("Pay Cash");
}

	}

}
