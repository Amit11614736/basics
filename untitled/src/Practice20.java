import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // age group category
        System.out.println("enter age");
        int age= sc.nextInt();
        if (age<=13)
        {
            System.out.println(" Child");
        } else if (age <=20) {
            System.out.println("Teen");

        } else if (age <=60) {
            System.out.println("Adult");

        }
        else {
            System.out.println("Senior citizen");
        }

    }
}
