class Solution {
    private double[][] memo = new double[200][200];

    public double soupServings(int n) {
        if (n > 4800) return 1.0;
        int units = (n + 24) / 25;
        return dfs(units, units);
    }

    private double dfs(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;
        if (memo[a][b] > 0) return memo[a][b];

        double res = 0.25 * (dfs(a - 4, b)
                           + dfs(a - 3, b - 1)
                           + dfs(a - 2, b - 2)
                           + dfs(a - 1, b - 3));
        memo[a][b] = res;
        return res;
    }
}
