package com.syntax.class01;

public class Class06Task02 {

	public static void main(String[] args) {

		double quiz=30;
		double midTerm=30;
		double finalExam=30;
		
		double average = (quiz+midTerm+finalExam)/3;
		String grade = null;
		
		
		System.out.println("What time is Grade");
		if (average >=90 && average <=100) {
			grade="A";
		}else if (average >=70 && average<90) {
			grade = "B";
		}
		else if (average >=60 && average<70) {
			grade = "c";
		} else if (average>=0 && average<=50) {
			grade = "F";
		} else {System.out.println("Please enter a valid score");}
		{ System.out.println(grade);}

}}
