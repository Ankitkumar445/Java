/*Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray)
 */
package Assing3;
import java.util.Scanner;
public class Q5 {
public static < E > void printArray( E[] inputArray){
    for(int i=0;i< inputArray.length;i++){
        System.out.println(inputArray[i]+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
    Integer iArray[]={1,2,3};
    String sArray[]={"First","second"};
    Double dArray[]={1.1,1.2,3.3};
        System.out.println("Integer array :");
        printArray(iArray);
        System.out.println("String array :");
        printArray(sArray);
        System.out.println("Double arary :");
        printArray(dArray);

    }
}
