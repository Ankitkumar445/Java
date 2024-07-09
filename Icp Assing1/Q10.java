/*Write a java program to exchange the value of 4 variables W,G,K,A such that the value of 
W will move to A, A to K, K to G and finally G to W. Exchange using with and without 
using extra variables*/
package allpractice;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with using extra variable
		int w=5;int g=10;int k=15;int a=20;
		int temp;
		temp=a;
		a=k;
		k=g;
		g=w;
		w=temp;
		System.out.println("w="+w);
		System.out.println("g="+g);
		System.out.println("k="+k);
		System.out.println("a="+a);
		
		//Wihout using extra variable 
		System.out.println("Without using extra variable");
		System.out.println("Before swap W:"+w+"G= "+g+"K= "+k+"A="+a);
		w=w+a;
		g=w-g;
		w=w-g;
		a=g-w;
		k=g+a;
		System.out.println("After swap W:"+w+"G= "+g+"K= "+k+"A="+a);
	}

}
