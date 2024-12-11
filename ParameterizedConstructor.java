package AllProgram;

public class ParameterizedConstructor {
int id;
String name;
ParameterizedConstructor(int i,String s){
	id=i;
	name=s;
}
	void  display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ParameterizedConstructor p1=new ParameterizedConstructor(1, "Saran");
		ParameterizedConstructor p2=new ParameterizedConstructor(2, "Saran");
		ParameterizedConstructor p3=new ParameterizedConstructor(3, "Saran");
		
		p1.display();
		p2.display();
		p3.display();

	}

}
