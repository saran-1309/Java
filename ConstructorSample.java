package AllProgram;

public class ConstructorSample {
	int id;
	String name;
	ConstructorSample(){
		this.id = id;
		this.name = name;
	}
	void display(int id, String name) {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ConstructorSample c1 =new ConstructorSample();
		ConstructorSample c2 =new ConstructorSample();
		ConstructorSample c3 =new ConstructorSample();
		c1.display(20,"Linga");
		c2.display(21,"Madhavan");
		c3.display(22,"vickram");
	
	}
}
