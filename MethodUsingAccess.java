package AllProgram;

public class MethodUsingAccess {
	
	public void display() {
		System.out.println("method using public");
	}
	public void display1(int a) {
		System.out.println("method using public through parameter "+a);
	}

	public static void main(String[] args) {
		MethodUsingAccess obj=new MethodUsingAccess();
		obj.display();
		obj.display1(25);
		

	}

}
