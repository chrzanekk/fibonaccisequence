import org.junit.Test;
import pl.com.konrad.fibonaccisequence.FibonacciSequence;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {

    @Test
    public void testFibonacciSequenceIterativeTenthElementOfSequence() {
        int elementOfSequence = 10;

        long result = FibonacciSequence.countIterative(elementOfSequence);

        assertEquals(55L,result);
    }


    @Test
    public void testFibonacciSequenceIterativeFifteenthElementOfSequence() {
        int elementOfSequence = 15;

        long result = FibonacciSequence.countIterative(elementOfSequence);

        assertEquals(610L,result);
    }

    @Test
    public void testFibonacciSequenceIterativeNineteenthElementOfSequence() {
        int elementOfSequence = 19;

        long result = FibonacciSequence.countIterative(elementOfSequence);

        assertEquals(4181L,result);
    }

    @Test
    public void testFibonacciSequenceIterativeZeroElementOfSequence() {
        int elementOfSequence = 0;

        long result = FibonacciSequence.countIterative(elementOfSequence);

        assertEquals(0L,result);
    }

    @Test
    public void testFibonacciSequenceIterativeFirstElementOfSequence() {
        int elementOfSequence = 1;

        long result = FibonacciSequence.countIterative(elementOfSequence);

        assertEquals(1L,result);
    }

    @Test
    public void testFibonacciSequenceRecursiveTenthElementOfSequence() {
        int elementOfSequence = 10;

        long result = FibonacciSequence.countRecursive(elementOfSequence);

        assertEquals(55L,result);
    }


    @Test
    public void testFibonacciSequenceRecursiveFifteenthElementOfSequence() {
        int elementOfSequence = 15;

        long result = FibonacciSequence.countRecursive(elementOfSequence);

        assertEquals(610L,result);
    }

    @Test
    public void testFibonacciSequenceRecursiveNineteenthElementOfSequence() {
        int elementOfSequence = 19;

        long result = FibonacciSequence.countRecursive(elementOfSequence);

        assertEquals(4181L,result);
    }

    @Test
    public void testFibonacciSequenceRecursiveZeroElementOfSequence() {
        int elementOfSequence = 0;

        long result = FibonacciSequence.countRecursive(elementOfSequence);

        assertEquals(0L,result);
    }

    @Test
    public void testFibonacciSequenceRecursiveFirstElementOfSequence() {
        int elementOfSequence = 1;

        long result = FibonacciSequence.countRecursive(elementOfSequence);

        assertEquals(1L,result);
    }
}
