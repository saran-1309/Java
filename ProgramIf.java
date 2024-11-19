package AllProgram;

public class ProgramIf {

	public static void main(String[] args) {
		/*if statement is executed only on true condition will be done in the current block
		 * nested if is nothing but several branches with another branches that allows to test multiple 
		 * criteria and increases the number of possible outcomes*/
		int age=7;
		if(age>=18) {
			System.out.println("Voting is allowed");
		}
		if(age<18) {
			System.out.println("Voting is not allowed");
		}
		if(age>80) {
			System.out.println("Voting is allowed in house itself");
		}
	}

}
