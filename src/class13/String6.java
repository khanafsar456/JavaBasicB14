package class13;

public class String6 {

	public static void main(String[] args) {
		// how many times a specific letter appeared in a sentence 
		
		String str="I love Java"; 
        System.out.println(str.charAt(2)); // to print any char from string


        for  (int i=0; i<str.length(); i++ ) {
            if(!(str.charAt(i)==' ')) { // to avoid spaces 
                System.out.println(str.charAt(i));
            }


		
		
}}}
