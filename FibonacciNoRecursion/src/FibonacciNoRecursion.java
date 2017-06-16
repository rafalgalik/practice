public class FibonacciNoRecursion {


    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int num) {

        if(num<2)
            return  num;

        int k=0;
        int l=1;
        for (int i = 2; i <num +2 ; i++) {
            k=k+l;
            l=k-l;
        }
        return k;

    }
}