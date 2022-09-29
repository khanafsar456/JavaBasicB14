package class09Arrays;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create an array of words: Java, Saturday, day, coding, is. 
 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
 */

		String[] words=new String[5];
		words [0]= "Java ";
		words [1] = "Saturday ";
		words [2] = "day ";
		words [3] = "is ";
		words [4] = "coding ";
		System.out.println(words[1] + words[3] + words[0] + words[4] + words[2]);		
		
		
	}

}
