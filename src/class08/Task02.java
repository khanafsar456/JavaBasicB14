package class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
	/*
	 * Write a program to ask a user to enter item they want to buy and the price of that item. 
	 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
	 * If user give more money program should return a change. 
	 * Whenever user done with payments program should say "Thank you for shopping!"
	 */
		
		int price=30;
		int paid=15;
	
			
		do {
			
			System.out.println("price of the book");
			if (price>paid){
			{System.out.println("pay more");}
			int total;
			total = price-paid;
			
			System.out.println(total);
			break;
			}
		
			
	 if (price <paid) {
			{System.out.println("pay less");}
			int total;
			total = paid - price;
			System.out.println(total);
			break;}
			
			
			

	}while (price!=paid);
		System.out.println("Thank you for the purchase");

		
		
}}
