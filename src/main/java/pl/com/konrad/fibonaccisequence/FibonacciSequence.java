package pl.com.konrad.fibonaccisequence;

public class FibonacciSequence {
    public static long countIterative(int entryNumber) {
        long result;
        if (entryNumber == 0) {
            result = 0L;
        } else if (entryNumber == 1) {
            result = 1L;
        } else {
            long onBeforeLastElement = 1L;
            long lastElement = 1L;
            for (int i = 3; i <= entryNumber; i++) {
                long sumOfPreviousTwoElements = onBeforeLastElement + lastElement;
                onBeforeLastElement = lastElement;
                lastElement = sumOfPreviousTwoElements;
            }
            result = lastElement;
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
