import java.util.Scanner;

public class Practice31SumOfDigits
{
    public static int sumofDigits(int no)
    {
//        System.out.println("helloooo");
        int add=0;
        while(no>0)
        {
            add=add+no%10;//add+=no%10;
            no=no/10;//no+/=10;
        }
        System.out.println(add);

        return add;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int no=sc.nextInt();
        sumofDigits(no);
    }
}