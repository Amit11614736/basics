import java.util.Scanner;

public class PracticeLoopWithMethod {

    public static void main(String[] args) {
        patternOne();
    }
    public static void patternOne(){
        int rows=0;
       while(rows<=5) {
           System.out.print("*");
           int i =0;
           while(i<rows){
               System.out.print(" *");
               i++;

           }
           System.out.println();
           rows++;

       }


    }
}
