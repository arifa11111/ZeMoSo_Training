package JavaAssignment;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any 3 float values : ");
        float a = keyboard.nextFloat();
        float b = keyboard.nextFloat();
        float c = keyboard.nextFloat();
        System.out.println("Average of three values : "+(a+b+c)/3);
    }
}