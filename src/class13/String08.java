package class13;

public class String08 {
	public static void main(String[] args) {
        String str="I am always consfused i was kidding";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        // sub string create a new string from the index 
        // in our example it creates from index 5
        System.out.println(str.substring(5));
        
        // we can define start and end point as well
        System.out.println(str.substring(5,21));

    }
}
