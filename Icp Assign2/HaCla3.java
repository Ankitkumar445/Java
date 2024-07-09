/*Write a java programs to input a four-digit number from the command line argument and find the sum of the first and last digit of the number. */
package commandline;

public class HaCla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int fn=num/100000;
		int ln=num%10;
		int sum=fn+ln;
		System.out.println("the sum of the first and last number is :"+sum);

	}

}
