package JavaAssignment;
import java.util.Scanner;
public class MadLibClone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name =sc.nextLine();
        System.out.println("Enter goal :");
        String goal =sc.nextLine();
        System.out.println("Enter type :");
        String type =sc.nextLine();
        System.out.println("Enter likes :");
        String likes =sc.nextLine();
        System.out.println("Enter age :");
        int age =sc.nextInt();
        System.out.println("There is a girl named "+name+" her age is "+age+" She had dreams want to achieve.Since childhood " +
                "she had a goal to be "+goal+" and live the life " +
                "the way she want.She is such a "+type+" girl.She likes "+likes+". I hope her dreams came true some day.");
    }
}
