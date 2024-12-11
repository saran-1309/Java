package AllProgram;
class GrandFather{
	public void showG() {
		System.out.println("He is a Grand Father");
	}
}
class Father extends GrandFather{
	public void showF() {
		System.out.println("He is a Father");
	}
}
class Son extends Father{
	public void showS() {
		System.out.println("He is a Son");
	}
}
public class HybridInheritanceExample extends Father{
public void showD() {
	System.out.println("She is a Daughter");
}
	public static void main(String[] args) {
		Son obj= new Son();
		obj.showS();
		obj.showF();
		obj.showG();
	
		HybridInheritanceExample obj2 = new HybridInheritanceExample();
		obj.showF();
		obj.showG();
		obj2.showF();
		obj2.showG();
	}
	}