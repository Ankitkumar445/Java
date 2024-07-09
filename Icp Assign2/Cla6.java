/*Write a java program to input a character from command line and display the ASCII value of the entered character. */
package commandline;

public class Cla6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=args[0].charAt(0);
		int asciivalue=(int)ch;
		System.out.println("the ascii value of "+ch+" is "+asciivalue);

	}

}
