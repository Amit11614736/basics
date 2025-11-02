import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // simple interest
        System.out.println("Enter your principle amount");
        int principle= sc.nextInt();;
        System.out.println("Enter the time duration in years");
        float years=sc.nextFloat();
        System.out.println("Enter the rate of interest per annum");
        float rate=sc.nextFloat();

        System.out.println("Simple interest is "+(principle*years*rate)/100);
    }
}
