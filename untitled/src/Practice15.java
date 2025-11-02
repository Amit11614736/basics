import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" number identifier");
        System.out.println("Enter no");
        int no= sc.nextInt();
        if(no>0)
        {
            System.out.println(no+" is a postive no");
        }
        else if(no==0)
        {
            System.out.println(" you have entered a zero "+ no);
        }
        else
        {
            System.out.println(no +" is a negative no");
        }
    }
}
