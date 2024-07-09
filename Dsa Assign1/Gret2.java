/* Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.*/
package normalprog;

public class Gret2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n= Integer.parseInt(args[0]);
			int count =0;
			while (n>2) {
				n/=2;
				count++;
			}
			System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is :"+"\n"+ count);
		}

	}
