package AllProgram;

import java.util.Scanner;

public class Task13Pattern {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int i,j,r;
		
		System.out.print("Input number of rows");
		r=scan.nextInt();
		
				for(i=1;i<=r;i++) 
				{
				for(j=1;j<=r-i+1;j++) 
					System.out.print(i);
					System.out.print("\n");
				}

	}

}
