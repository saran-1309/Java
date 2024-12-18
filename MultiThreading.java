package AllProgram;

class MultithreadingDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getName()+" is Running");
		}
		catch(Exception e) {
			System.out.println("Exception is caugth");
		}
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		int n=8;
		for(int i =0;i<n;i++) {
			MultithreadingDemo obj = new  MultithreadingDemo();
			obj.start();
		}
	}
}