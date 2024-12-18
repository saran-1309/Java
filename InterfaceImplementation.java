package AllProgram;

interface printable{
	void print();
	
}
public class InterfaceImplementation implements printable{

	public void print() {
	
		System.out.println("Hello");
}
	public static void main(String[] args) {
	
		InterfaceImplementation obj = new InterfaceImplementation();
		
		obj.print();
	}
}