package AllProgram;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int num, count = 0, armstrong = 0, rem, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an Armstrong number or not: ");
        num=scan.nextInt();
        num2=num;   
        int temp=num;
        while (temp>0) {
            count=temp%10;
        }
        while (num>0) {
            rem = num % 10;
            int power= 1;

        for (int i=1;i<=count;i++) {
                power *= rem;
            }
            armstrong += power;
            num=num/10;
        }
        if (num2==armstrong) {
            System.out.println(num2 + " is an Armstrong number");
        } else {
            System.out.println(num2 + " is not an Armstrong number");
        }
    }
}
