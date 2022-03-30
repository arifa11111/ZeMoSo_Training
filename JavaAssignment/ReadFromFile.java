package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){
        int sum=0;
        try{
            File file = new File("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\input.txt.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                sum+= (sc.nextInt());
            }
            System.out.println("Sum of numbers in file : " +sum);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
}
