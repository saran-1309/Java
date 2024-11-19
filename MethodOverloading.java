package AllProgram;

public class MethodOverloading {
	
	public int sum(int x,int y) {
		
		return(x+y);
	
	}
	public int sum(int x, int y, int z) {
		return(x+y+z);
	}
	
	public double sum(double x, double y, double z) {
		return(x+y);
	}

	public static void main(String[] args) {
		// Method Overloading - method overloading is also known as function overloading that allows multiple methods to have a same name but different parameters.
		//Method overloading is also known as compile time polymorphism, static polymorphism,or early binding polymorphism
		//changing the number of parameter, changing the datatype of arguement,changing the number of parameter.
		MethodOverloading mo1 = new MethodOverloading();
		
		System.out.println(mo1.sum(10,20));
		System.out.println(mo1.sum(15, 13,3));
		System.out.println(mo1.sum(10,20));
	}

}
// method overriding that occurs when the sub class has the same method has the parent class.
/*conditional statement based on certain conditions and generate decision accordingly.
TYPES OF CONDITIONAL STATEMENT:
*If
*If-else
*else if
Loop - while, do while, for.*/