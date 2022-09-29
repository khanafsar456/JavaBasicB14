package class09Arrays;

public class HomeworkTask02 {

	public static void main(String[] args) {
		/*
		 *  Create an array of animals and store 5 elements into it. 
		 *  Using 2 different loops print all elements from the array.
		 */
String[] animal= {"Cow", "Donkey", "Dog", "Horse", "Cat"};
		
		for (int a=0; a<animal.length; a++) {
			System.out.println(animal[a]);
		
		}	
		System.out.println("***********");
		// method 2
		String[] animals= {"Cow", "Donkey", "Dog", "Horse", "Cat"};
		for(String a:animals) {
			System.out.println(a);
		}
		
		

	}}

