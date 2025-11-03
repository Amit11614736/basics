import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Bitwise compliment NOT operator
        System.out.println("Enter no");
        int num=sc.nextInt();
        System.out.println(~num);
    }
}
