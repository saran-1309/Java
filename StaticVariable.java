package AllProgram;
public class StaticVariable {
	static int cube(int x) {
		return x*x*x;
	}
	public static void main(String[] args) {
		int result = StaticVariable.cube(3);
		System.out.println(result);
	}
}