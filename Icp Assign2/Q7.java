/*write a java program that displays the following table.Cast floating point numbers into integers
 * a  b  pow(a,b)
 * 1  2   1
 * 2  3   8
 * 3  4   81 
 * 4  5   1024
 * 5  6   15625
*/
package la2;

public class Q7 {

	public static void main(String[] args) {
		System.out.println("a\tb\tpow(a,b)");
		double i =1.0;
		double j =2.0;
		double p =Math.pow(i, j);
		System.out.println((int)i+"\t"+(int)j+"\t"+(int)p);
		i++;
		j++;
		p=Math.pow(i, j);
		System.out.println((int)i+"\t"+(int)j+"\t"+(int)p);
		i++;
		j++;
		p =Math.pow(i, j);
		System.out.println((int)i+"\t"+(int)j+"\t"+(int)p);
		i++;
		j++;
		p =Math.pow(i, j);
		System.out.println((int)i+"\t"+(int)j+"\t"+(int)p);
		i++;
		j++;
		p =Math.pow(i, j);
		System.out.println((int)i+"\t"+(int)j+"\t"+(int)p);
	}

}
