package class13;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java="java is Very good akljdlkfj opsdjif ";
		System.out.println(java.replace("good", "Excellent"));
		
		System.out.println("================");
		/*
		 * to remove or replace 
		 * [a-z] jitny bi small letter hain un ko remove kr dy ga " " space ky saat
		 */
		System.out.println(java.replaceAll("[a-z]", " "));
	}
}
