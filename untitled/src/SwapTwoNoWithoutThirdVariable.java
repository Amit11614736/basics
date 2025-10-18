import java.util.Scanner;
public class SwapTwoNoWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amit score");
        int amit =sc.nextInt();
        System.out.println("Enter sumit score");
        int sumit=sc.nextInt();

        System.out.println("Before swap "+"\n amit score: "+amit+" \tsumit score: "+sumit);
        amit=amit+sumit;
        sumit=amit-sumit;
        amit=amit-sumit;
        System.out.println("After swap "+"\n amit score: "+amit+" \tsumit score: "+sumit);

    }
}
