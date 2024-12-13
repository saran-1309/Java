package AllProgram;

public class Arrayexample2 {

	public static void main(String[] args) {
		String[] cars = {"Skoda","Ford","Mazda"};
		System.out.println(cars[0]);
		int myarray[]=new int[10];
	
		myarray[0]=9;
		myarray[1]=91;
		myarray[3]=99;
		myarray[4]=96;
		myarray[5]=100;
		
		System.out.println("contents of array");
		for(int element:myarray) 
		{
			System.out.println(element);
		}	
	}
}