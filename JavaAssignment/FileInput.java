package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args){
        Scanner infile;
        int input;
        try{
            infile = new Scanner(new File("input.txt"));
            while(infile.hasNext()){
                 input = infile.nextInt();
                System.out.println(input);
            }
            infile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Can't find the file");
        }
        catch (InputMismatchException e){
            System.out.println("Mismatch!! ");
        }
    }
}
