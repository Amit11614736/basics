import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no");
        int num1=sc.nextInt();
        System.out.println("Enter second no");
        int num2= sc.nextInt();
        int result = num1 & num2; // AND bitwise operator
        System.out.println(result);
    }
}
