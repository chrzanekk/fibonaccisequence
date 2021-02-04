package pl.com.konrad.fibonaccisequence;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            System.out.println(FibonacciSequence.countIterative(i));
        }

//        for (int i = 0; i <= 48; i++) {
//            System.out.print(i + " ");
//            System.out.println(FibonacciSequence.countRecursive(i));
//        }
    }
}
