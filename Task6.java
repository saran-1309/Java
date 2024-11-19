package AllProgram;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		//write a program to print a table of any number between 1 to 10 using for loop
		int res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Which Multiplication Table you want :");
		int num=scan.nextInt();
		
		for(int i=1;i<=10;i++) {
			res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
	}

}
