public class ArgumentsParameters {
    public static void main(String[] args) {

        System.out.println(addTwoNo(4,7));
    }
    public static int addTwoNo(int num1, int num2){
        System.out.println("First no"+ num1);
        System.out.println("Second no"+ num2);
        int sum= num1+num2;
        return sum;
    }

}
