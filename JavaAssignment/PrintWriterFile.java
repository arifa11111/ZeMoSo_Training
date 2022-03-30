package JavaAssignment;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class PrintWriterFile {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Hello Arifa ");
        names.add("HAving dinner ");
        names.add("let's have  ");
        names.add("fun  ");
        names.add("aafa ");
        try{
            //FileWriter fw = new FileWriter("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\names.txt");
            PrintWriter pw = new PrintWriter("C:\\Users\\shaik\\OneDrive\\Desktop\\zemosoassign\\names.txt");
            for(String name : names)
                pw.println(name);
            pw.close();
            System.out.println("Success");
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }
}
