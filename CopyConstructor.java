package AllProgram;

public class CopyConstructor {
String model;
int year;
//parameterized constructor
CopyConstructor(String model,int year){
	this.model=model;
	this.year=year;
}
//Copy Constructor
CopyConstructor(CopyConstructor cc){
	this.model=cc.model;
	this.year=cc.year;
}
void display() {
	System.out.println("model "+model+"  year  "+year);
}
	public static void main(String[] args) {
		CopyConstructor c1 =new CopyConstructor("Audi A6",2008);
		CopyConstructor c2 =new CopyConstructor("Toyato innova",2008);
		CopyConstructor c3 =new CopyConstructor("Volkswagan Polo",2008);
		c1.display();
		c2.display();
		c3.display();
	}
}
