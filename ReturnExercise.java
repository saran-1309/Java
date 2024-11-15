package AllProgram;

public class ReturnExercise {
	
	public static int addition(int num1,int num2) {
		
		return num1+num2;
	}
	
	public static String words(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		int sum= addition(num1,num2);
		System.out.println(sum);
		
		String a= "Hii, I am saran,";
		String b= " I'm a java full stack student";
		
		String c= words(a,b);
		System.out.println(c);

	}

}
