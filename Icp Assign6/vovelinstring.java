/*Write a method that finds the number of occurrences of a specified character in a string using 
the following header:
public static int count(String str, char a)
For example, count ("Welcome", 'e') returns 2. 
Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string.*/

package ass6;
import java.util.Scanner;
public class vovelinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String str=sc.next();
		System.out.println("the occurence of the of the string is :"+count(str)+"times.");
	}
	public static int count(String str){
		int c=0;
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				c++;
			}		
		}
		return c;
	}
}

