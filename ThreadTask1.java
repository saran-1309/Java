package AllProgram;

import java.util.Scanner;

public class ThreadTask1 extends Thread {
	int val;
	public  ThreadTask1(int val){
		this.val = val;
			}
		public void run() {
			if(val%2==0) {
				System.out.println(val+" is an Even number");
			}
			else {
				System.out.println(val+" is a Odd number");
			}
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number till wich you want to segregate even and odd numbers");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			ThreadTask1 obj = new ThreadTask1(i);
			obj.start();
		}
	}
}