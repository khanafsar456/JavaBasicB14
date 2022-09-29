package class102Darrays;

public class Task01 {

	public static void main(String[] args) {
		String[][] suffex=new String [2] [4] ;
		suffex [0][0] = "Mr";
		suffex [0][1] = "Mrs";
		suffex [0][2] = "Ms";
		suffex [0][3] = "Miss";
		
		suffex [1][0] = "Smith";
		suffex [1][1] = "Jordan";
		suffex [1][2] = "Jackson";
		suffex [1][3] = "Obama";
		
		System.out.println(suffex[0][1]+ " " + suffex[1][0] );
		System.out.println(suffex[0][0]+ " " + suffex[1][3] );
		System.out.println(suffex[0][3]+ " " + suffex[1][1] );
		
	
	}

	}


