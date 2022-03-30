package JavaAssignment;
import java.io.File;
import java.util.Scanner;
public class Assignment1 {
    public void find(){
        File file = new File("C:\\Users\\shaik");
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name: ");
        name = in.nextLine();
        do {
            int temp = 0;
            String[] files = file.list();
            for (String ele : files) {
                if (ele.equals(name)) {
                    System.out.println(("File located at " + file.getAbsolutePath()));
                    temp = 1;
                }
            }
            if (temp == 0) {
                System.out.println("file not found please re enter file name");
            }
            System.out.println("enter a name or type exit to exit");
            name = in.nextLine();
        } while (true);
    }

    public static void main(String[] args) {
        Assignment1 f = new Assignment1();
        f.find();
    }
}
