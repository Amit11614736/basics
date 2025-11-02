import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // greatest of three nos
        System.out.println("Enter first no");
        int num1=sc.nextInt();
        System.out.println("Enter second no");
        int num2=sc.nextInt();
        System.out.println("Enter third no");
        int num3=sc.nextInt();
        if(num1>num2)
        {
            if (num1>num3) {
                System.out.println(num1 + " is greatest among three nos");
            }

        }
        else if (num2>num3)
        {
            if (num2>num1) {
                System.out.println(num2 + " is greatest among three nos");
            }
        }
        else {

            System.out.println(num3 + " is greatest among three nos");
        }

    }
}
