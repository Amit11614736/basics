import java.util.Scanner;

public class LogicalOptr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ticket discount");
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("are you a female? true or false");
        boolean gender=sc.nextBoolean();
        if (age<5)
        {
            System.out.println("75% discount");
        }
        else if (age>=60)
        {
            System.out.println("senior citizen discount 50%");
        } else if (age>=60 && gender )
        {
            System.out.println("You are female senior citizen 75% discount");
        }

        else
        {
            System.out.println("no discount");
        }
    }
}
