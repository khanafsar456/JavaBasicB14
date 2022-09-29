package class09Arrays;

public class HomeworkTask03 {

	public static void main(String[] args) {
		/*
		 * 3. Create an array on integers and calculate the sum of all elements in an array
		 */
		int [] numbers = {25,35,75,40,45,55};
		int sum1 = 0;
		for (int i=0; i<numbers.length; i++) {
			sum1 +=numbers[i];
		}
		System.out.println(sum1);
	}

}
