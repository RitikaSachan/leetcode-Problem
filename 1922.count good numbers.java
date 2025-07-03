class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1_000_000_007;
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;
        return (int) (powMod(5, evenCount, MOD) * powMod(4, oddCount, MOD) % MOD);
    }

    private long powMod(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) result = result * base % mod;
            base = base * base % mod;
            exp /= 2;
        }
        return result;
        
    }
}
