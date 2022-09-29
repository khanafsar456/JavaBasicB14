package class7;
import java.util.*;

public class Class08Tas2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your secret number");
        int num=scan.nextInt();
        int guess;

        do {
            System.out.println("Guess the secret number");
            guess=scan.nextInt();
        } while(num!=guess);
        System.out.println("You won!");
    }
	
	}


