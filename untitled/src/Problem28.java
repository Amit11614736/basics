import java.util.Scanner;

public class Problem28 {
    // multiplication of any number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int userInput=sc.nextInt();
        multiply(userInput);
    }
    public static int multiply(int num)
    {
        //System.out.println(num);
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+(i*num));
            i++;
        }
        return num;
    }
}
