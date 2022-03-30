package JavaAssignment;
import java.util.Scanner;
public class IterrativeStatements {
    public static void main(String args[]){
        int i=1,sum=0;
        Scanner sc =new Scanner(System.in);
        while (i>0){
            System.out.print("Enter an +ve integer :");
            int n = sc.nextInt();
            if(n>=0)
                sum+=n;
            else
                break;
            i++;
        }
        System.out.println(sum);
    }
}
