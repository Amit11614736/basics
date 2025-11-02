import java.security.Principal;
import java.util.Scanner;
public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // compound interest
        System.out.println("Enter Principle amount");
        int principle=sc.nextInt();
        System.out.println("Enter rate of interest per annum");
        float rate=sc.nextFloat();
        System.out.println("enter time in years ");
        float time=sc.nextFloat();

        double comInt= principle*Math.pow((1+rate/100),time);
        System.out.println(comInt);

    }
}
