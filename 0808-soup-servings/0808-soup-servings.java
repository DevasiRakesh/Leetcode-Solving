class Solution {
   private Map<String, Double> memo = new HashMap<>();

    public double soupServings(int n) {
        // Optimization for large n
        if (n >= 4800) return 1.0;

        // Normalize n to units of 25 mL
        int N = (n + 24) / 25;

        return dp(N, N);
    }

    private double dp(int a, int b) {
        // Base cases
        if (a <= 0 && b <= 0) return 0.5; // Both empty at the same time
        if (a <= 0) return 1.0;           // A is empty first
        if (b <= 0) return 0.0;           // B is empty first

        String key = a + "," + b;
        if (memo.containsKey(key)) return memo.get(key);

        // The 4 operations, each with probability 0.25
        double result = 0.25 * (
            dp(a - 4, b) +
            dp(a - 3, b - 1) +
            dp(a - 2, b - 2) +
            dp(a - 1, b - 3)
        );

        memo.put(key, result);
        return result;
    }

}