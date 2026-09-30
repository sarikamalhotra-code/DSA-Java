class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if (nn < 0) {
            nn = -nn;
        }
        double result = power(x, nn);
        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }
    private double power(double x, long n) {
        // Base case
        if (n == 0) {
            return 1.0;
        }
        // Recursion
        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}