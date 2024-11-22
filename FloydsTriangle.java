package AllProgram;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofRows;
		System.out.println("Input number of rows");
		Scanner scan = new Scanner(System.in);
		numberofRows=scan.nextInt();
		int number=1;
		for(int row=1;row<=numberofRows;row++) {
			
		for(int column=1;column<=row;column++) {
			System.out.print(number+" ");
			number++;
		}
				System.out.println();
		}

	}
	
}
