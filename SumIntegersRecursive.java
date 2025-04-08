public class SumIntegersRecursive {
    public static void main(String[] args) {
        int n = 3; // n input
        int result = sumN(n);
        System.out.println("Sum from 1 to " + n + " is: " + result);
    }

    public static int sumN(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + sumN(n - 1); // recursive case
    }
}

