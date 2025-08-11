class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        int m = Integer.bitCount(n);
        int[] powers = new int[m];
        for (int i = 0; n > 0; i++) {
            int bit = n & -n;
            powers[i] = bit;
            n -= bit;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            long prod = 1;
            for (int k = l; k <= r; k++) {
                prod = (prod * powers[k]) % MOD;
            }
            ans[i] = (int) prod;
        }

        return ans;
    }
}
