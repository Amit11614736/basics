import java.util.Scanner;

public class Problem30 {
    public static void calculateFactorial()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no to calculate factorial");
        int num=sc.nextInt();
        int fact=1;
        while(num>1)
        {
            fact*=num; // fact= fact*num;
            num--;
        }
        System.out.println(fact);
//        return fact;
    }

    public static void main(String[] args) {
        calculateFactorial();
    }
}