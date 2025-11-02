import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Converter ------------" );
        System.out.println("Enter Fahrenheit");
        float fah=sc.nextFloat();
        float celsius= (fah-32)*5/9;
        System.out.println(fah +" degree fahrenheit is "+celsius+" degree celsius");
    }
}
