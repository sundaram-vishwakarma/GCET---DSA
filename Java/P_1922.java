class Solution {
    static final int M = (int)1e9 + 7;

    private long findPower(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long half = findPower(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long result = (findPower(5, evenPositions) * findPower(4, oddPositions)) % M;
        return (int) result;
    }
}
