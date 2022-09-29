package class13;

public class String4 {

	public static void main(String[] args) {
		String str=" i love java ";
        System.out.println(str);
        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         */
        System.out.println(str.trim());
        
        
        String str1="java is beautiful and I Love that thing about";
        // startsWith is used to check the first word or letter
        
        System.out.println(str1.startsWith("java"));
        
 // endsWith is used to check the last word or letter
        
        System.out.println(str1.endsWith("about"));

// contains is used to check the letter in middle present or not
        
        System.out.println(str1.contains("love"));
        // if we dont the code is written in upper or lower case so
        // we can do with two methods it Called Method Chaining 
        System.out.println(str1.toLowerCase().contains("love"));
	}

}
