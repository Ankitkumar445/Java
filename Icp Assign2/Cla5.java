/*Write a java programs that takes three integer value from the command line and prints them in ascending order.Use Math.min() and Math.max().*/
package commandline;

public class Cla5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c =Integer.parseInt(args[2]);
		//int d =Integer.parseInt(args[3]);
		int max=Math.max(a, Math.max(b, c));
		int min=Math.min(a, Math.min(b, c));
		int mid=((a+b+c)-(max+min));
		System.out.println("int in ascending order"+min+","+mid+","+max); 

	}

}
/*int min = Math.min(a, Math.min(b, Math.min(c, d)));
            int max = Math.max(a, Math.max(b, Math.max(c, d)));
            int secondMin = Math.min(Math.max(a, b), Math.max(c, d));
            int secondMax = Math.max(Math.min(a, b), Math.min(c, d));*/