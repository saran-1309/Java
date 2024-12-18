package AllProgram;
class Shape{
	public void display() {
		System.out.println("Inside shape method");
	}
}
class Rectangle extends Shape{
	public void area() {
		System.out.println("Inside Rectangle Method");
	}
}
class Cube extends Rectangle{
	public void volume() {
		System.out.println("Inside cube Method");
	}
}
public class MultilevelProgram {
	public static void main(String[] args) {
		Cube cube = new Cube();
		cube.display();
		cube.area();
		cube.volume();
	}
}