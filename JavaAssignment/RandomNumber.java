package JavaAssignment;

import java.util.Random;

public class RandomNumber {
    public static void main(String args[]){
        Random random = new Random();
        System.out.println("Random number : "+random.nextInt());
        System.out.println("Random number : "+random.nextInt(400));
        System.out.println("Random number : "+random.nextInt(7) + 1);
    }
}
