package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MainTest {

    @Test
    public void testFibonacciIteration() {
        runTest(Main::fibonacciIteration);
    }

    @Test
    public void testFibonacciRecursion() {
        runTest(Main::fibonacciRecursion);
    }

    @Test
    public void testFibonacciDynamic() {
        runTest(Main::fibonacciDynamic);
    }

    private void runTest(FibonacciFunction fibonacciFunction) {
        Map<Integer, Long> testCases = new HashMap<>();
        testCases.put(0, 0L);
        testCases.put(6, 8L);
        testCases.put(7, 13L);
        testCases.put(8, 21L);
        testCases.put(9, 34L);
        testCases.put(10, 55L);
        testCases.put(20, 6765L);
        testCases.put(30, 832040L);

        testCases.forEach((position, expectedResult) ->
                Assertions.assertEquals(expectedResult, fibonacciFunction.calculate(position), Integer.toString(position)));
    }

    interface FibonacciFunction {
        long calculate(int n);
    }
}