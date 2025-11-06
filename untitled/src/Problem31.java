import java.util.Scanner;

public class Problem31 {
    public static void sumOfDigits(int num)
    {
        int add=0;
        while(num>0)
        {
            add=add+num%10;
           num= num/10;

        }
        System.out.println("Sum of digit is "+add);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        sumOfDigits(num);
    }


}