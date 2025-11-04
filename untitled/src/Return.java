import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1=inputNo();
        int num2=inputNo();
        System.out.println(num1+num2);


    }
    public static void greet(){
        System.out.println("Welcome");
    }
    public static int inputNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        return number;
    }
}
