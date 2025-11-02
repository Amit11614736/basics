import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.println("Enter first no");
        int firstNo=sc.nextInt();
        System.out.println("Enter second no");
        int secondNo=sc.nextInt();

        System.out.println("adding "+firstNo+" + "+secondNo+" = "+(firstNo+secondNo));
        System.out.println("subtract "+firstNo+" - "+secondNo+" = "+(firstNo-secondNo));
        System.out.println("Multiply "+firstNo+" * "+secondNo+" = "+(firstNo*secondNo));
        System.out.println("Divide "+firstNo+" / "+secondNo+" = "+(firstNo/secondNo));
        System.out.println("Modulud "+firstNo+" % "+secondNo+" = "+(firstNo%secondNo));



    }
}
