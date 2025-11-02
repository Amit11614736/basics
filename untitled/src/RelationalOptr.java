import java.util.Scanner;

public class RelationalOptr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Driving license portal");
        System.out.println("Enter your age");
        int age= sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for driving license");
        }
        else
        {
            System.out.println(" minor - not eligible for driving license");
        }
    }
}
