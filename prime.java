public class prime{

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { // 0, 1, and negative numbers are not prime
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // This optimizes the check as factors always come in pairs (one <= sqrt(num), one >= sqrt(num))
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If divisible, it's not prime
                return false;
            }
        }
        return true; // If no divisors found, it's prime
    }
}