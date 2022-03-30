package JavaAssignment;

import java.util.Random;
import java.util.Scanner;

public class HeadAndTails {
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while(true) {
            int Computer = random.nextInt(2);
            System.out.println("Enter your guess : ");
            int HumanGuess = sc.nextInt();
            if (Computer == HumanGuess) {
                System.out.println("Congratulations!!!!");
                break;
            }
            else {
                System.out.println("Give another try..");
                continue;
            }

        }
    }
}
