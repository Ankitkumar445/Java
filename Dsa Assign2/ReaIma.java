/*Define a class called Complex with instance variables real, imag and instance methods
 void setData(),
 void display(),
 public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above */
package Iter;

import java.util.*;
class Complex{
    int real;int imaginary;
    void SetData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the real value :");
        this.real= sc.nextInt();
        System.out.println("enter the imaginary value :");
        this.imaginary=sc.nextInt();
    }
    void display(){
        System.out.println(this.real+"+"+this.imaginary+"i");
    }
        Complex add(Complex c1,Complex c2){
        Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
             return c3;
        }

}
public class ReaIma {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        c1.SetData();
        c2.SetData();
        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);

        c1.display();
        c2.display();
        c3.display();

    }
}
