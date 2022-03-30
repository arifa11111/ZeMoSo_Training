package JavaAssignment;

import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args){
        int[] Arr;
        int sum=0;
        Arr = new int[5];
        System.out.print("Enter Array elements :");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
            System.out.println(Arr[i]);
            sum+=Arr[i];
        }
        System.out.println("Addition of array elements : "+sum);
    }
}
