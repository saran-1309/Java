package AllProgram;

import java.util.Scanner;

class Class{
	void display(){
		System.out.println("1.Course/n"+"2.Instructor"+"3.Credits");
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		switch(input) {
		case "Course":
			Course c = new Course();
			c.courses();		}
		
}
class Course extends Class{
	
	void courses() {
		System.out.println("Java\n"+"Python\n"+"Dotnet");
		Scanner cinp = new Scanner(System.in);
		String cour= cinp.nextLine();
		switch(cour) {
		case "Java","java":
			System.out.println("Java Full Stack Development");
			System.out.println("Java Training in Chennai at SLA Institute equips the learners to develop desktop, web, mobile, and gaming applications and it is the topmost choice of global professionals. Java is OOPs-based, a high-level programming language that can be learned easily by beginners to kick-start their career in application development. We provide industry-standard coaching in our Java Training Institute in Chennai to enhance the development skills of IT aspirants worldwid");
			System.out.println("Enter ");
			break;
		case "Python","python":
			System.out.println("Python Full Stack Development");
			System.out.println("Our Python Course in Chennai aims to provide the best coaching for freshers and working professionals to kick-start or enhance their career in various domains like web development, MEAN stack development, DevOps, Full Stack Development, and so on. We have framed a Python course curriculum as per the industry requirements that help our students to shine with top-notch skills to develop interactive and impressive websites.");
			break;
		case "Dotnet","dotnet":
			System.out.println("DotNet Full Stack Development");
			System.out.println("SLA Institute provides the Best VB.NET Training in Chennai and lays a strong foundation for your career. Both the basics and advanced concepts are taught with clarity. Real-time projects are provided to make you ready for the live scenario. Enroll with us, and make yourself industry-ready!");
			break;
		}
		
	}
}
	class OnlineClass extends Class{
		void online() {
			
		}
}
public class CourseTask {
	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		vh.display();
	}
}