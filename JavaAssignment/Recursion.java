package JavaAssignment;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int n){
        if(n<=1)
            return n;
        else
            return n*factorial(n-1);
        }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt(),f = 0;
    System.out.println("Factorial of n : "+factorial(n));
}
}