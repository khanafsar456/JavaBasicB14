package com.syntax.class01;

import java.util.Scanner;

public class Class05Task01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("which country are you from?");
		String country=input.nextLine();
		String language;
		
		switch(country) {
		case "Pakistan":
			language="Urdu";
			break;
			case "USA":
				language="English";
				break;
			case "India":
				language="Hindi";
				break;
				default:
					language="I speak different language";
		}
System.out.println("I speak "+language);

	}

}
