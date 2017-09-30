package org.agilecrete;

public class FizzBuzz
{

    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";

    public String convert(int number) {
        if (isDivisibleByThree(number) && isDivisibleByFive(number)) {
            return FIZZ + BUZZ;
        } else if (isDivisibleByFive(number)) {
            return BUZZ;
        } else if (isDivisibleByThree(number)) {
            return FIZZ;
        }
        return Integer.toString(number);
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
