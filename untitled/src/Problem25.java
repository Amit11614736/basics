import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Bitwise LEFT shift Operator
        System.out.println("Enter no");
        int num=sc.nextInt();
        int result=num<<1;// here 1 can be kept anything as per need.
        // 1 is used because i want to shift 1 digit, it can be used as 1 or 2 or 3 or 4
        System.out.println(result);

    }
}
