/*write a java programs to read an integer between 0 and 1000 and adds all the digits in the integer.For 
example ,if an integer is 749,the sum of all its digits is 20.*/package la2;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER A 3-DIGIT NUMBER :");
		Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        sum += input % 10;
        input = input / 10;

        sum += input % 10;
        input = input / 10;

        sum += input % 10;

        System.out.println("The sum of all the digits is " + sum);

        sc.close();
    }
}

