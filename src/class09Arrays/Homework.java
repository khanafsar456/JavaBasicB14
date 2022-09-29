package class09Arrays;

public class Homework {
	public static void main(String[] args) {
	
		String[] cars= {"Honda", "Toyota", "BMW", "Mazda", "Nissan", "Ford"};
		
		for (int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		
		}	
		System.out.println("***********");
		// method 2
		String[] car= {"Honda", "Toyota", "BMW", "Mazda", "Nissan", "Ford"};
		for(String a:car) {
			System.out.println(a);
		}
		
		
		
	}

}
