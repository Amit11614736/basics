import java.util.Scanner;
public class UserInput {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        byte age=sc.nextByte();
        System.out.println("experience in months");
        short exp=sc.nextByte();
        System.out.println("salary");
        int salary=sc.nextInt();
        System.out.println("phone no");
        long phone=sc.nextLong();
        System.out.println("enter cgpa");
        float cgpa=sc.nextFloat();
        System.out.println("Enter percentage");
        double percentage=sc.nextDouble();
        System.out.println("are you a robot?");
        boolean result=sc.nextBoolean();
        System.out.println("gender , for male m fro female f");
        char gender=sc.next().charAt(0);
        System.out.println("hello "+name+" how are you??");
        System.out.println("your age is : "+age);
        System.out.println("experience level "+exp+"months");
        System.out.println("your salary: "+salary);
        System.out.println("contact details: "+phone);
        System.out.println("cgpa "+cgpa);
        System.out.println("percentage scored "+percentage+"%");
        System.out.println("you are a robot "+result);
        System.out.println("gender: "+gender);
    }
}
