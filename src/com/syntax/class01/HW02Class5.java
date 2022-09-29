package com.syntax.class01;

public class HW02Class5 {

	public static void main(String[] args) {
	
	
	String month="September";
	System.out.println("Your Birth Season is");
	String birth = null;
	
	if (month.equals("March")|| month.equals("April")|| month.equals("May")){
		birth ="Spring";
	}
	else if (month.equals("June")|| month.equals("July")|| month.equals("August")){
		birth ="Summer";
	}
	else if (month.equals("September")|| month.equals("Octover")|| month.equals("November")){
		birth ="Fall";
	}
	else if (month.equals("December")|| month.equals("January")|| month.equals("February")){
		birth ="Winter";
	}  else
	{
		System.out.println("invalid");
	}
	
	System.out.println(birth);
	
 
	}

}
