package class09Arrays;

public class HomeworkTask04 {
	public static void main(String[] args) {
		
		/*
		 * From an array of integer elements find the largest number.
		 */
		int [] numbers = {25,35,75,4750,400, 45,55};
		int largestNumber = 0;
		for (int i=0; i<numbers.length; i++) {
			if (largestNumber < numbers[i]) {
				largestNumber=numbers[i];
			}
		}System.out.println(largestNumber);
		
	}

}
