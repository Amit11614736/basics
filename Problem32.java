import java.util.Scanner;

public class Problem32 {

    public static int lcm(int first, int second)
    {
       /* int i=1;
        while(i<=second)
        {
            int factor=first*i;
            if(factor%second==0)
            {
                return factor;
            }
            i++;
        }
    return 0;*/

        int i=1;
        while(true)
        {
            int factor=first*i;
            if(factor % second == 0 )
            {
                return factor;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int first=sc.nextInt();
        System.out.println("Enter second no");
        int second=sc.nextInt();
        int lcm=lcm(first,second);
        System.out.println("lcm of "+first+" , "+second+" is "+lcm);

    }
}
