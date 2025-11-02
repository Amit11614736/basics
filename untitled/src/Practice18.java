import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // leap year or not

        System.out.println("Enter year");
        int year=sc.nextInt();
        if (year%400 == 0 || (year %100 !=0 && year %4==0) )
        {
            System.out.println("leap year");
        }

        else {
            System.out.println("not a leap year");
        }
    }
}
