package AllProgram;
abstract class Animal{

	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Sleeeeppppp");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("pigsays : wee wee");
	}
}
public class AbstractionClasses {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}
