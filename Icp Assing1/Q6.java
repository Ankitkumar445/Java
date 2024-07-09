/*Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java 
program to print the following output using string concatenation. (You can take extra string 
variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 */
package allpractice;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String ruler1="1";
		String ruler2=ruler1+"2"+ruler1;
		String ruler3=ruler2+"3"+ruler2;
		String ruler4=ruler3+"4"+ruler3;
		System.out.println(ruler1);
		System.out.println(ruler2);
		System.out.println(ruler3);
		System.out.println(ruler);*/
		String s=" ";
		for(int i=1;i<=4;i++) {
			s=s+i+s;
			System.out.println(s);
					
		}
		

	}

}
