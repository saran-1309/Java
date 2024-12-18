package AllProgram;

public class StaticVarandMethod1 {
	private static int count =20; //Static variable
	public static void print()  //Static Method
	{
		System.out.println("Number of Count"+count);
	}
public static void main(String args[]) {
	StaticVarandMethod1 obj = new StaticVarandMethod1();
	obj.print();
	System.out.println(count);
}
}