public class FibonacciNoRecursion2 {


    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int num) {

        int k=0;
        int l=1;
        for (int i = 2; i <=num ; i++) {
            k=k+l;
            l=k-l;
        }
        return k;

    }
}
