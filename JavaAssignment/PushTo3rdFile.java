package JavaAssignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class PushTo3rdFile {
    public static void main(String[] args){
        Scanner NamesFile;
        Scanner AgesFile;
        PrintWriter pw;
        try{
            NamesFile =new Scanner(new File("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\names.txt"));
            AgesFile = new Scanner(new File("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\ages.txt"));
            pw = new PrintWriter("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\nameage.txt");
            String name = null;
            int age=0;
            while(AgesFile.hasNext()) {
                name = NamesFile.nextLine();
                age = AgesFile.nextInt();
                pw.println(name + " is " + age + " years old . ");
            }
            NamesFile.close();
            AgesFile.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Not found");
        }

    }
}
