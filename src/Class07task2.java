
public class Class07task2 {
public static void main(String[] args){
	/*
	 * Print numbers from 100 to 1

Print even numbers from 20 to 100 

Print only odd numbers from 100 to 1
(2 different ways)
	 */
	int c=100;
	while (c>=1) {
		
		System.out.print(c +" ");
		c--;
	}
	
	System.out.println("--------");
	int a=100;
	while (a>=1) {
		if(a%2!=0){
		System.out.print(a +" ");
		
	}a--;}
	System.out.println("--------");
	
	int b=20;
	while (b<=100) { 
		if(b%2==0) {
		System.out.print(b + " ");}
		b++;}
	System.out.println("--------");
}
}
