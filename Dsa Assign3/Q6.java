/*Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
public static <T> int count(T[] array, T item)
 */
package Assing3;

import java.util.Scanner;

public class Q6 {
    public static <T> int count(T[] array, T item){
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==item)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("enter the elements :");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elements to be searched :");
        int a= sc.nextInt();
        int c=count(arr,a);
        System.out.println(a+"occurs"+c+"times");

    }
}
