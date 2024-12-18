package AllProgram;

import java.util.Scanner;

public class SwitchSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a char");
		String value=scan.nextLine(); 
		
		switch(value) {
		case "s":
			System.out.println("Sunday");
			break;
		case "m":
			System.out.println("Monday");
			break;
		case "t":
			System.out.println("Tuesday");
		case "w":
			System.out.println("Wednesday");
			break;
		case "th":
			System.out.println("Thursday");
			break;
		case "f":
			System.out.println("Friday");
			break;
		case "sa":
			System.out.println("Saturday");
			break;
			default :
				System.out.println("Enter only the options (s,m,t,w,th,f,sa)");
				
		}
	}

}
