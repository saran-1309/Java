package AllProgram;

import java.util.Scanner;

public class EnumSample {
 enum Course{Java,AI,ML}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Java or AI or ML");
		String course = scan.nextLine();
		Course[] presentcourse = Course.values();
		
		for(Course c:presentcourse) {
		switch(c) {
		case Java:
			System.out.println("Java is always powerful");
			break;
		case AI:
			System.out.println("AI is more intellegent");
			break;
		case ML:
			System.out.println("Machine learning is used in data science");
			break;
		}
	}
}
}