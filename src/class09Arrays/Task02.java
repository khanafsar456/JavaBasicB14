package class09Arrays;

public class Task02 {

	public static void main(String[] args) {
	/*
	 * Create an array of names and store all names of your group. 
	 * Then print your name from that array. (use 2 different ways of creating an array).
	 */
		
		// Method 1
		String [] name = {"James", "John", "Smith"};
		System.out.println(name[1]);
		// Method 2
		String[] names=new String[3];
		names [0]= "James";
		names [1] = "John";
		names [2] = "Smith";
	
		System.out.println(names[2]);
				
	}

}
