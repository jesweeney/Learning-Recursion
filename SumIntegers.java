public class SumIntegers {
    public static void main(String[] args) {
        int n = 3; // Example input
        int result = sumN(n);
        System.out.println("Sum from 1 to " + n + " is: " + result);
    }

    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

