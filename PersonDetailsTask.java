package AllProgram;

import java.util.Scanner;

public class PersonDetailsTask {
	String name;
	int age;
	PersonDetailsTask(){
		this.name = name;
		this.age = age;
	}
	void name(String name) {
		System.out.println("Entered Name is :"+name);
	}
	void age(int age) {
		System.out.println("Entered age is :"+age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name your name");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		PersonDetailsTask obj = new PersonDetailsTask();
		obj.name(name);
		obj.age(age);
	}
}