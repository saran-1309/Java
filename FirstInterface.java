package AllProgram;

interface Interface1 {
	
	public void mymethod();
}
interface SecondInterface{
	
	public void myOthermethod();
}
public class FirstInterface implements Interface1,SecondInterface{
	
	public void mymethod() {
	
		System.out.println("Some text");
	}
	
	public void myOthermethod() {
		
		System.out.println("some text");
	}
}
class Main{
	
	public static void main(String[] args) {
	
		FirstInterface di = new FirstInterface();
		di.mymethod();
		di.myOthermethod();
	}
}