package com.syntax.class01;

import java.util.Scanner;

public class SwitchClassTask02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please tell  me where are you from");
		String country=input.nextLine();
		String favoriteFood;
		
		switch(country) {
		case "USA":
			favoriteFood="Burgers and fries";
			break;
			case "Kazakhstan":
				favoriteFood="Shawarma";
				break;
			case "Pakistan":
				favoriteFood="Biryani";
				break;
				default:
					favoriteFood="Cook your favorite food";
		}
System.out.println(favoriteFood);
	}

}
