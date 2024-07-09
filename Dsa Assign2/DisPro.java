/* In a super market each product is having minimum details like prodId, price, quantity
that is used during the biling process. Keeping this in mind prepare a class named as
Product having the member variables
 prodId, price, quantity
 a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a
display() method to display the value of instance variables. A person went to market
and purchase 5 different products. Using the above mentioned class, display the details
of products that the person has purchased. Also, determine how much total amount
the person will pay for the purchase of 5 products.
 */
package Iter;

class Product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0; // Static variable to keep track of total price

    // Parameterized constructor to initialize product details
    Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        // Update total price
        totalPrice += price * quantity;
    }

    // Method to display product details
    void display() {
        System.out.println("Iter.Product ID: " + prodId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class DisPro {
    public static void main(String[] args) {
        // Create 5 different products
        Product p1 = new Product(1, 10.5, 2);
        Product p2 = new Product(2, 5.75, 3);
        Product p3 = new Product(3, 20.25, 1);
        Product p4 = new Product(4, 15.0, 4);
        Product p5 = new Product(5, 8.99, 2);

        // Display details of purchased products
        System.out.println("Details of purchased products:");

        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
        System.out.println();
        p4.display();
        System.out.println();
        p5.display();
        System.out.println();

        // Calculate and display total amount to pay
        System.out.println("Total amount to pay: " + Product.totalPrice);
    }
}
