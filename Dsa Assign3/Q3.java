/*Create a class Student & enter mark, name of the student. If mark is more than 100, create
exception MarksOutOfBoundException & throw it using Java. */
package Assing3;
import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String str){
        super(str);
    }
}
class Students6 {
    String name;int Marks;
    void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        name = sc.next();
        System.out.println("enter marks :");
        Marks = sc.nextInt();
        try {
            if (Marks > 100 || Marks < 0)
                throw new MarksOutOfBoundException("enter marks between 1 to 100 :");
            else
                System.out.println("name :" + name + "\tMarks :"+Marks);
        } catch (MarksOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
    public class Q3 {
        public static void main(String[] args) {
            Students6 s = new Students6();
            s.check();
        }
}
