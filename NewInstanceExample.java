package AllProgram;

public class NewInstanceExample {
	String str="Hello";
	public static void main(String[] args) {
		try 
		{
			NewInstanceExample obj=NewInstanceExample.class.newInstance();
			System.out.println(obj.str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
