package be.thibber.gamification.example;

/**
 * Do not create tests for this class, this is just an example.
 * Points & achievements will not be given for this class.
 */
public class Example {
    /**
     * @param a First number
     * @param b Second number
     * @return The sum between {@code a} and {@code b}
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * @param a First number
     * @param b Second number
     * @return The difference between {@code a} and {@code b}
     */
    public int difference(int a, int b) {
        return a + b;
    }

    /**
     * @param a First number
     * @param b Second number
     * @return The division between {@code a} and {@code b}
     */
    public int division(int a, int b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }

        return a / b;
    }
}
