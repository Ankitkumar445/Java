/*Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements. */
package normalprog;
import java.util.*;
public class HQ4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dimensions of matrix :");
        int n= sc.nextInt();
        double[][] a1= new double[n][n];
        double[][] b1= new double[n][n];
        System.out.println("Enter elements of matrix a:");
        for (int i=0; i<n;i++) {
            for (int j = 0; j <n;j++) {
                a1[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter elements of matrix b:");
        for (int i=0; i < n; i++)  {
            for (int j = 0; j <n;j++)  {
                b1[i][j]=sc.nextDouble();
            }

        }  
        double c[][]=addMatrix(a1,b1);
        System.out.println("Addition of matrix a & b:");
        for (int i=0; i<n; i++){
            for (int j=0;j<n; j++)   {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();   

    }
        //Addition of matrices
      public static double[][]addMatrix(double a[][],double b[][]) {
        double[][] c = new double[a.length][a[0].length];
        for (int i=0; i <a.length; i++)  {
            for (int j=0; j<a[0].length; j++)   {
                c[i][j]= a[i][j]+b[i][j];
            }
        }
              return c;
	}
}
