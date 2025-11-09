///// Iteration
class Solution {
    public double myPow(double x, int n) {
        if(x==1.0){
            return 1;
        }
        /* by typecasting n, It will not showing the stack over flow error */
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double currentProduct = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }
        return result;
    }
}





///// Recursion
class Solution {
    double power(double x, long n){
        if(n==1){
            return x;
        }
        else{
            double half = power(x, n/2);
            if(n%2==0){
                return 1.0*half*half;
            }
            else{
                return 1.0*half*half*x;
            }
        }
    }
    
    public double myPow(double x, int n) {
        if(x==1.0){
            return 1;
        }
        /* by typecasting n, It will not showing the stack over flow error */
        long N = n;
        if(n==0){
            return 1;
        }
        else if(N>0){
            return power(x, N);
        }
        else{
            return 1.0/power(x, -1*N);
        }

    }
}
