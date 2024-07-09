/*Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements. */
package normalprog;
public class HQ5 {
	public static void main(String[] args) {
	        int[][] matrix = new int[4][4];
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                matrix[i][j] = (int)(Math.random()*(2));
	            }
	        }
	        for (int i = 0; i < matrix.length; i++)   {
	            for (int j = 0; j < matrix[i].length; j++)   {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	        // Find and display the first row and column with the most 1s
	    System.out.println("The largest row index: "+largestRow(matrix));
	    System.out.println("The largest column index: "+largestColumn(matrix));  
	    }
	    /** largestRow finds the first row with the most 1s **/
	    public static int largestRow(int m[][]) {
	        int maxRowIndex = 0;
	        int max = 0;
	        for (int i = 0; i < m.length; i++) {
	            int count = 0;
	            for (int j = 0; j < m[i].length; j++)  {
	                if (m[i][j] == 1)   {
	                    count++;
	                }
	            }
	            if (count > max) {
	                max = count;
	                maxRowIndex = i+1;
	            }
	        }
	        return maxRowIndex;
	    }
	    /** largestColumn finds the first column with the most 1s **/
	public static int largestColumn(int[][] m) {
	        int maxColumnIndex = 0;
	        int max = 0;
	        for (int j= 0; j< m[0].length; j++)  {
            int count = 0;
	        for (int i = 0; i < m.length; i++)  {
	            if (m[i][j] == 1) 
	              {
	                 count++;        
                }
	         }
	            if (count > max) 
            {
	            max = count;
	            maxColumnIndex =j+1;
	        }
	    }
	    return maxColumnIndex;
	}
}
