package AllProgram;
class BaseClass{
	int parentNum=10;
}
class Subclass1 extends BaseClass{
	int ChildNum1=1;
}
class Subclass2 extends BaseClass{
	int ChildNum2=2;
}
class Subclass3 extends BaseClass{
	int ChildNum3=3;
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Subclass1 childobj1=new Subclass1();
		Subclass2 childobj2=new Subclass2();
		Subclass3 childobj3=new Subclass3();

		System.out.println("parentNum*childNum1="+childobj1.parentNum*childobj1.ChildNum1);
		System.out.println("parentNum*childNum2="+childobj2.parentNum*childobj2.ChildNum2);
		System.out.println("parentNum*childNum3="+childobj3.parentNum*childobj3.ChildNum3);
	}

}
