import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" ENter a no to check even or odd");
        int num= sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num +" is even no");
        }
        else
        {
            System.out.println(num +" is odd no");
        }
    }
}
