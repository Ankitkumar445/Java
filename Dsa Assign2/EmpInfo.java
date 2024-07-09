/*Define a base class Person with instance variable name, age. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance
variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information
of employee details. */
package ass2;
class person{
String name;
int age;
public person(String name,int age){
    this.age=age;
    this.name=name;
}
}
class Employee extends person{
    int Eid;
    double Salary;


    public Employee(String a ,int b, int c, double d) {
       super(a, b);
        this.Eid=c;
        this.Salary=d;

    }
  void  empDisplay(){

        System.out.println(name+" "+age+" "+Eid+" "+Salary);
    }
}

public class EmpInfo {
    public static void main(String[] args) {
        Employee s1=new Employee("ramesh",50,7846466,84202);
        s1.empDisplay();
        Employee s2=new Employee("amresh",40,7846266,50562);
        s2.empDisplay();
    }
}
