package AllProgram;

import java.util.Scanner;

class Person{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	private int age;
}
public class EncapsulationExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=scan.nextLine();
		System.out.println("enter your age :");
		int age = scan.nextInt();
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		System.out.println("Name :"+person.getName());
		System.out.println("Age :"+person.getAge());
	}
}