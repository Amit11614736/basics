import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter no to check even or odd"); // using bitwise operator
        int num=sc.nextInt();
        if((num & 1)==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
