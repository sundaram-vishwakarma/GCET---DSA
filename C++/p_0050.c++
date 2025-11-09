// Iteartion
class Solution {
public:
    double myPow(double x, int n) {
        if (x == 1.0) {
            return 1;
        }

        long long N = n; // to avoid overflow for INT_MIN
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        for (long long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }

        return result;
    }
};







// Recursion
class Solution {
public:
    double power(double x, long long n) {
        if (n == 1) {
            return x;
        } else {
            double half = power(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
    }

    double myPow(double x, int n) {
        if (x == 1.0) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }

        long long N = n; // convert to handle overflow

        if (N > 0) {
            return power(x, N);
        } else {
            return 1.0 / power(x, -N);
        }
    }
};
