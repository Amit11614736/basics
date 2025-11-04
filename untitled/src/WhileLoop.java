public class WhileLoop {
    public static void main(String[] args) {
        // i want to print no from 1 to 10
        int num=1; // initialization
        while(num<=10)
        {
            System.out.println(num);
            num+=1;
            //  num=num+1;
            //num++;

        }
        // reverse counting 500 to 200
        System.out.println("-----------------------------------------------");
        int no=500;
        while(no>=200)
        {
            System.out.println(no);

            no-=1;
        }
    }
}
