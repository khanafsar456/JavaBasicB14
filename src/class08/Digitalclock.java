package class08;

public class Digitalclock {

	public static void main(String[] args) {

		for (int hour=00; hour<=23; hour++) {
			
			for  (int minutes=00; minutes<=59; minutes++) 
			{
				if (minutes <10 && hour < 10)
				{	System.out.println("0"+hour+ ":" + "0"+minutes);}
					else if (minutes>10 && hour >10)
					{System.out.println(hour+ ":" +minutes);}
					else if (hour > 10 && minutes<10)
					{System.out.println(hour + ":" +"0"+minutes);}
					else if (hour<10 && minutes>10)
					{System.out.println("0"+hour+ ":" + minutes);}
			}
			
			
		}
}}
