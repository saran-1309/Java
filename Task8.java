package AllProgram;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// write a program to find the year is leap year or not
		//divisible by 4 and not divisible by 100
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year to check it is a leap year or not :");
		int year=scan.nextInt();
		
		if(year%4==0 && year%100!=0) {
			System.out.println(year+" is Leap year");
		}
		else {
			System.out.println(year+" is not a Leap year");
		}
	}

}
