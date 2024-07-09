/*Write a method that finds the number of occurrences of a specified character in a string using 
the following header:
public static int count(String str, char a)
For example, count ("Welcome", 'e') returns 2. */
package ass6;

public class occurence {

	public static void main(String[] args) {
		String str="ankit"; char ch='a';
		String str1=str.toUpperCase();
		ch=Character.toUpperCase(ch);
		System.out.println(occurrence(str1, ch));

	}
	public static int occurrence(String str, char a) {
		int k=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==a)
				k++;
		}
		return k;
	}

}
