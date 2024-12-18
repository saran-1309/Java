package AllProgram;

class Outer{
	int x = 13;
	class Inner{
		int y = 15;
	}
}
public class JavaInnerClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner inn = out.new Inner();
		
		System.out.println(out.x+inn.y);
	}

}
