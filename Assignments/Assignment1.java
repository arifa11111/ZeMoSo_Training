package Assignments;
import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File dir = new File("C:\\Users\\shaik\\networking");
        String[] files = dir.list();
        while(true) {
            System.out.print("Enter file name: ");
            String SearchingFile = sc.nextLine();
            for (String i : files) {
                if (i.equals(SearchingFile)) {
                    System.out.println(dir.getAbsolutePath()+"\\"+SearchingFile);
                    break;
                }
            }
        }
    }
}




