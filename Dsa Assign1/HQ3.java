/*Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1.
 */
package normalprog;
import java.util.Scanner;
public class HQ3 {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the array a[]:");
			int n=sc.nextInt();
			int a[] = new int[n]; 
			int b[] = new int[n];
			System.out.print("enter the element of a[]:");
			for (int i=0;i<=n-1;i++) {
				a[i]= sc.nextInt();
			}
			System.out.print("enter the element of b[]:");
			for (int i=0;i<=n-1;i++) {
				b[i]=sc.nextInt();	
			}
			int []c=new int[n];
			for(int i=0;i<=n-1;i++) {
				c[i]=a[i]*b[i];
			}
			System.out.println("dot product 'c[]': ");
			for (int i=0;i<=n-1;i++) {
				System.out.println(c[i]+" ");
			}
		}

	}
