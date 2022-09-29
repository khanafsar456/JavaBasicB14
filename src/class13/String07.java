package class13;

import java.util.Arrays;

public class String07 {

		/*
		 * we can do both way, first one is good just use the for loop
		 * second, is to convert to array and use str[i]
		 */

		public static void main(String[] args) {
	        String str="I love java programming";
	        /*
	         * toCharArray will convert a String to an array of chars
	         */
	        char[] charArray=str.toCharArray();

	        System.out.println(Arrays.toString(charArray));
	        // for individual index
	        System.out.println(charArray[7]);

	        // how many time a number have appeared
	        // below we are counting how many time 'a' appeared 
	        int counter=0;
	        for (char c:charArray) {
	        	if (c=='a') {
	        		counter++;
	        	}
	        }
	        System.out.println("the letter a has appeared " +counter+ " times");
	}

}
