package JavaAssignment;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintReverseOfArrayList {
    public static void main(String[] args){
       ArrayList<Integer> numbers =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = sc.nextInt();
        while(n>=0){
            numbers.add(n);
            n= sc.nextInt();
        }
        for(int i= numbers.size()-1;i>=0;i-- ){
            System.out.print(numbers.get(i)+"\t");
        }
    }
}

