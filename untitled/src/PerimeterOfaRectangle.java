import java.util.Scanner;
public class PerimeterOfaRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Length of AB");
        int ab=sc.nextInt();
        System.out.println("Length of BC");
        int bc = sc.nextInt();
        System.out.println("Length of CD");
        int cd = sc.nextInt();
        System.out.println("Length of AD");
        int ad=sc.nextInt();
        System.out.println("Perimeter of rectagle ABCD is "+(ab+bc+cd+ad));
    }
}
