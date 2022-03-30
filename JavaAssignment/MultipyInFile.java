package JavaAssignment;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipyInFile {
    public static void main(String[] args){
        try{
            Scanner numbers=new Scanner(new File("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\ages.txt"));
            PrintWriter pw =new PrintWriter("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\multiply.txt");
            while(numbers.hasNext()){
                pw.println(2*numbers.nextInt());
            }
            numbers.close();
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println("Not found");
        }
    }
}
