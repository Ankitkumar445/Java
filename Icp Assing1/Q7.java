/*Write a java program to exchange the values of two variables of integer type X and Y using 
third temporary variable Z */
package allpractice;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=6;
		System.out.println("before exchange :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=a;
		a=b;
	    b=c;
	    System.out.println("after exchange :");
	    System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
