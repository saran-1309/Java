package AllProgram;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String course ="java";
		
	switch(course) {
	case"python":
		System.out.println("Python is a simple coding language ");;
		break;
		
	case "java":
		System.out.println("Java is a powerfull coding language");
		int version= scan.nextInt();

	switch(version) {
	case 6:
		System.out.println("That is old version");
		break;
	case 8:
		System.out.println("wow nice version");
		break;
	}
	break;
	case "c++":
	System.out.println("C++ is the base of java");	
	}

}
}