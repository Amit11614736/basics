import java.util.Scanner;

public class Problem29 {

    public static int additionOfOddNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int addOdd=0;
        while (num>0)
        {
            if(num %2!=0)
            {
                addOdd+=num;
            }
            num--;

        }
        System.out.println("addition of odd nos "+addOdd);
        return addOdd;
    }


    public static void main(String[] args) {

        additionOfOddNo();









        // sum of all odd numbers to the number- user input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no");
//        int num=sc.nextInt();
//        int addOdd=0;
//        while(num>=1)
//        {
//            if(num %2!=0)
//            {
//                addOdd+=num;
//            }
//            num--;
//        }
//        System.out.println(addOdd);

//        if(num % 2 ==0)
//        {
//            System.out.println("even");
//        }
//        else
//        {
//            System.out.println("odd");
//        }
    }

}
