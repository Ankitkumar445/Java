/*Define a class Deposit. The instance variable of the class Deposit are mentioned
below.
1
Instance Variable Data Type
Principal Long
Time Integer
Rate Double
TotalAmt Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are
(i) display ( ): to display the value of instance variables,
(ii) calcAmt( ): to calculate the total amount.
totalAamt = Principal + (PrincipalÖrateÖTime)/100; */
package Iter;

class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    // Constructor1
    Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0.0;
    }

    // Constructor2
    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    // Constructor3
    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0.0; // Assuming default rate is 0
    }

    // Constructor4
    Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 0; // Assuming default time is 0
        this.rate = rate;
    }

    // Method to display instance variables
    void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + totalAmt);
    }

    // Method to calculate total amount
    void calcAmt() {

        totalAmt = principal + (principal * rate * time) / 100;
    }
}

public class ConsOver {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Deposit d1 = new Deposit(10000, 2, 5.0);
        Deposit d2 = new Deposit(10000, 2, 5.0);
        Deposit d3 = new Deposit(5000, 3);
        Deposit d4 = new Deposit(20000, 7.5);

        // Calculating total amount for each deposit
        d1.calcAmt();
        d2.calcAmt();
        d3.calcAmt();
        d4.calcAmt();

        // Displaying details of each deposit
        System.out.println("Details of Iter.Deposit 1:");
        d1.display();
        System.out.println();

        System.out.println("Details of Iter.Deposit 2:");
        d2.display();
        System.out.println();

        System.out.println("Details of Iter.Deposit 3:");
        d3.display();
        System.out.println();

        System.out.println("Details of Iter.Deposit 4:");
        d4.display();
        System.out.println();
    }
}
