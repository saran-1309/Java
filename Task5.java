package AllProgram;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// write a program to print even numbers and odd numbers seperately using if
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number to find even or odd");
		int i=scan.nextInt();
		
		if(i%2==0) {
			System.out.println(i+"The entered number is even");
		}
		else {
			System.out.println(i+"The entered number is odd");
		}
	}

}
