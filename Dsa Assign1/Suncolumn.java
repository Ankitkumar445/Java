/*Question-10:
Write a method that returns the sum of all the elements in a specified column in a matrix 
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column. */
package normalprog;
import java.util.Scanner;
public class Suncolumn {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sum =0.0;
		double arr[][] = new double[3][4];
		System.out.print("ENter a 3-by-4 matrix row by row: ");
		for(int i =0;i<3;i++) {
			for (int j=0;j<4;j++) {
				arr[i][j]= sc.nextDouble();
			}
		}
		for (int k=0;k<4;k++) {
			sum += sumColumn(arr,k);
			System.out.println("Sum of the elements at column "+k+ "is "+ sum);
			sum=0;
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0.0;
		for(int i=0;i<3;i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

}
