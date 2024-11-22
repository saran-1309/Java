package AllProgram;

import java.util.Scanner;

public class Task14Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	
	int i,j,r;	
	System.out.print("Input number of rows");
	r=scan.nextInt();
		
	for(i=0;i<r;i++) 
	{
	for(j=r;j>i;j--) 
	System.out.print(j);
	System.out.print("\n");
	}
	
	}

	}

