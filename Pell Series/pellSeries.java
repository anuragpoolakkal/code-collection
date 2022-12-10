// Write a program to print pell series.

import java.io.*;
import java.util.Scanner;

public class pellSeries {

    // function to find the nth pell number
    public static int pellNumber(int num) {
        if (num <= 2)
            return num;
        // recursively called the function
        return 2 * pellNumber(num - 1) + pellNumber(num - 2);
    }

    public static void main(String args[]) {
        int num; // num is a term that we want to find
        System.out.println("Enter number/limit: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        // calling the function and prints the pell number
        System.out.println("The pell number of position " + num + " is: " + pellNumber(num));
        System.out.println("\nPell series till position " + num + " is: ");
        for (int i = 0; i <= num; i++) {
            System.out.println(pellNumber(i));
        }
    }
}