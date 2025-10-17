import java.util.Scanner;
public class SwapTwoNos {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no for amit");
        int amit =sc.nextInt();
        System.out.println("enter no for sumit");
        int sumit= sc.nextInt();
        System.out.println("Before Swap \n amit alloted no is: "+amit+"\t sumit alloted no is: "+sumit);
        int empty;
        empty=amit;
        amit=sumit;
        sumit=empty;
        System.out.println("\nnow after swap \n amit alloted no is: "+amit+"\t sumit alloted no is: "+sumit);
    }
}
