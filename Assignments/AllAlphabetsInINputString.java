package Assignments;
import java.util.*;

public class AllAlphabetsInINputString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String InputString=sc.nextLine();
        //time Complexity = O(n)
        //Space Complexity = O(n)
        if(InputString.toUpperCase().chars().filter(c->Character.isLetter(c)).distinct().count()==26)
            System.out.println("Input Sting contains all the alphabets");
        else
            System.out.println("Input String doesn't contain all alphabets");
    }
}
