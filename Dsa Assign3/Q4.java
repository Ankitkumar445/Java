/*Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box. */
package Assing3;
import java.util.Scanner;
class Box<T>{
    T volume;
    Box(T volume){
        this.volume=volume;
    }
    void Display(){
        System.out.println("volume of the box :"+volume);
    }

}
public class Q4 {
    public static void main(String[] args) {
        Box<String> ob1=new Box<String>("Ten");
        ob1.Display();
        Box<String> ob2=ob1;
        ob2.Display();
        ob2.volume="five";
        ob2.Display();
        ob1.Display();
        Box<String> ob3=ob1;
        ob3.Display();
        ob3.volume="nine";
        ob2.Display();
        Box<Integer> ob4=new Box<Integer>(124);
        ob4.Display();


    }
}
