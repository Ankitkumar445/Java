/*Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 
'b', 'o', and 'n' exactly once */
package normalprog;

public class carbon {
	public static void main (String args[]) {
		char arr[]= {'C','A','R','B','O','N'};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					for(int l=0;l<arr.length;l++) {
						for(int m=0;m<arr.length;m++) {
							for(int n=0;n<arr.length;n++) {
if(i!=j && i!=k  &&j!=k && i!=l && i!=m && i!=n &&  j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n) {
	System.out.println(""+arr[i]+arr[j]+arr[k]+arr[l]+arr[m]+arr[n]);
}
							}
						}
					}
				}
			}
		}
	
	    
	}


}
