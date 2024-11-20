package AllProgram;

import java.util.Scanner;

public class Task11Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String A =scan.nextLine();
		String rev="";
		for(int i=A.length()-1;i>=0;i--)
		{
		rev=rev+A.charAt(i);	
		}
	
		 if(A.equals(rev))
		 {
			 System.out.println(A+ " is a palindrome");
		 }
		 else
		 {
			 System.out.println(A+" not a plaindrome");
		 }

	} 

}