package AllProgram;

public class ConstructorOverloading {
		int id;
		String name;
		ConstructorOverloading() {
			System.out.println("This is default constructor");
		}
		ConstructorOverloading(int i,String n){
			id=i;
			name=n;
		}
	public static void main(String[] args) {
		ConstructorOverloading cs=new ConstructorOverloading();
		System.out.println("Student Id"+cs.id+"\n StudentName "+cs.name);
		System.out.println("\n Parameterized Constructor");
		ConstructorOverloading cs1=new ConstructorOverloading(10,"David");
		System.out.println("Student Id"+cs1.id+"\n StudentName "+cs1 .name);
	}
}
