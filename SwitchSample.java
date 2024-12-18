package AllProgram;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 4 :");
		int month=scan.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Value of one");
			break;
		case 2:
			System.out.println("value of two");
			break;
		case 3:
			System.out.println("value of three");
			break;
		case 4:
			System.out.println("value of four");
			break;
			default:
				System.out.println("Please enter a number between 1 to 4 only");
		}

	}

}
