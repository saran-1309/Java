package AllProgram;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		//
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num=scan.nextInt();
	        int i=1;
	        while(i*i<num) {
	            i++; 
	        }
	        if(i*i==num) {
	            System.out.println(num+ " is a perfect square.");
	        } else {
	            System.out.println(num+ " is not a perfect square.");
	        }

	}

}
