package pl.com.konrad.fibonaccisequence;

public class FibonacciSequence {
    public static long countIterative(int entryNumber) {
        long result;
        if (entryNumber == 0) {
            result = 0L;
        } else if (entryNumber == 1) {
            result = 1L;
        } else {
            long x1 = 0L;
            long x2 = 1L;
            long temp;
            for (int i = 2; i <= entryNumber; i++) {
                temp = x1 + x2;
                x1 = x2;
                x2 = temp;
            }
            result = x2;
        }
        return result;
    }

    public static long countRecursive(int entryNumber) {

        if (entryNumber == 0) {
            return  0;
        } else if (entryNumber == 1) {
            return 1;
        } else {
            return countRecursive(entryNumber-1) + countRecursive(entryNumber-2);
        }

    }
}
