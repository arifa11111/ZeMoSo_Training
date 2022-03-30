package JavaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAgeNameArryList {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age =  new ArrayList<>();
        while(sc.hasNextLine())
            names.add(sc.nextLine());
        while(sc.hasNextInt())
            names.add(sc.nextLine());
        for(int j=0;j<names.size();j++)
            System.out.println(names.get(j) + " is " + age.get(j) + " years old");
    }
}
