package JavaAssignment;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String args[]){
        //find smallest number using logical operator
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a,b,c values :");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        if(a<b && a<c){
            System.out.println("a is smallest number");
        }
        else if(b<a && b<c){
            System.out.println("b is smallest number");
        }
        else{
            System.out.println("c is smallest number");
        }
    }
}
