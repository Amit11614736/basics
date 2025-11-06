import java.util.Scanner;

public class RePractice31 {
    public static int sumOfDigit( int num)

    {
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;//sum+=num%10;
            num/=10;  //num=num/10;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        sumOfDigit(num);
//        System.out.println("Input digit is "+num+" and there sum of digit is: "+sum);
    }
}
