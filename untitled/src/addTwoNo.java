import java.util.Scanner;
public class addTwoNo {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no you want to add:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("addition of "+a+" + "+b+" = "+(a+b));
    }
}
