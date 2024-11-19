package AllProgram;

public class IfElseIFprogram {

	public static void main(String[] args) {
		/* if else if is used to evaluate multiple expression and execute different statement
		 */
		
		int  a=10,b=15,c=131;
		
		if((a>b) && (a>c)) {
			System.out.println("A is the greatest number");
		}
		else if((b>a) && (b>c)) {
			System.out.println("B is the greatest number");
		}
		else{
			System.out.println("C is the greatest number");
		}
	}

}
