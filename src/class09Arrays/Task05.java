package class09Arrays;

public class Task05 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
		char[] grades1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (int  i=grades1.length-1; i>=0; i--) {
			System.out.println(grades1[i]+ " ");
		}
	}

}
