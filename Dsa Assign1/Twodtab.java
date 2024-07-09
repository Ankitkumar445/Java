/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array. */
package normalprog;
import java.util.Scanner;
public class Twodtab {
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		System.out.print("enter rows and coumns of 2D array :");
		int r = sc.nextInt();
		int c= sc.nextInt();
		int arr[][]= new int[r][c];
		int sum =
		System.out.print("Enter the elements of 2D array:");
		for(int i =0;i<r;i++) {
			for (int j=0;j<c;j++) {
				arr[i][j]= sc.nextInt();
				sum+= arr[i][j];
			}
		}
		System.out.println("The elements of 2D array are:");
		for(int i =0;i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of the elements of the 2D array is "+ sum);
    }
}
