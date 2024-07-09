/* WAP to display the multiplication table from 2 to 15.*/
package ass5;
public class Q5 {

	public static void main(String[] args) {
		for(int i=2; i<=15; i++) {
			System.out.println("the multiplication table of : "+i+" is :");
			for(int j=1;j<=10;j++) {
				System.out.println(i+" x "+j+" = "+j*i);
			}
			System.out.println();
			
		}

	}

}
