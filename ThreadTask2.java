package AllProgram;

import java.util.Scanner;

//.write a Java program that calculates the average of 5 subject using threads
public class ThreadTask2 extends Thread{
	int sub;
	ThreadTask2(int sub){
		this.sub=sub;
	}
	public void run(){
		System.out.println("your average is "+sub/5);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Maths mark out of 100");
		int mat =scan.nextInt();
		
		System.out.println("Enter your Science mark out of 100");
		int sci =scan.nextInt();
		
		System.out.println("Enter your Social Science mark out of 100");
		int soc =scan.nextInt();
		
		System.out.println("Enter your Tamil mark out of 100");
		int tam =scan.nextInt();
	
		System.out.println("Enter your English mark out of 100");
		int eng =scan.nextInt();
		
			int sub = mat + sci + soc + tam + eng;
			
		ThreadTask2 obj = new ThreadTask2(sub);
		obj.start();
	}

}
