package AllProgram;

import java.util.Scanner;

public class MethodParameterEx {
	
	static void addition(int a,int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	
	static void Subtraction(int a,int b) {
		int c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}
	
	static void Multiplication(int a,int b) {
		int c=a*b;
		System.out.println(a+"*"+b+"="+c);
	}
	
	static void divison(int a,int b) {
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	
	static void modulus(int a,int b) {
		int c=a%b;
		System.out.println(a+"%"+b+"="+c);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		addition(a,b);
		Subtraction(a,b);
		Multiplication(a,b);
		divison(a,b);
		modulus(a,b);

	}

}
