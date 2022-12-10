/*AIM: Write a program to print pell series.

Algorithm:
Step 1: Start
Step 2: Create function pellNumber which accepts 'num' as input.
Step 2: If num <= 2, return num.
Step 3: Else return sum of twice the previous Pell number and the Pell number before that.
Step 4: In main method, accept number/limit and store to num.
Step 5: Print pell number of position num.
Step 6: Print pell series till position num using recursion.
Step 7: Stop

*/

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
        System.out.println("\nThe pell number of position " + num + " is: " + pellNumber(num));
        System.out.println("\nPell series till position " + num + " is: ");
        for (int i = 0; i <= num; i++) {
            System.out.println(pellNumber(i));
        }
    }
}
