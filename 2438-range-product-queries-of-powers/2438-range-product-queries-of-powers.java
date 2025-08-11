import java.util.*;

public class Solution {
    public static final int MOD = 1_000_000_007;

    public List<Integer> productQueries(int n, int[][] queries) {
        // Step 1: Extract powers of 2 from n
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }

        // Step 2: Precompute prefix products (modular)
        int m = powers.size();
        long[] prefixProd = new long[m];
        prefixProd[0] = powers.get(0);
        for (int i = 1; i < m; i++) {
            prefixProd[i] = (prefixProd[i - 1] * powers.get(i)) % MOD;
        }

        // Step 3: Answer the queries
        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];

            long prod;
            if (left == 0) {
                prod = prefixProd[right];
            } else {
                prod = prefixProd[right] * modInverse(prefixProd[left - 1], MOD) % MOD;
            }
            result.add((int) prod);
        }

        return result;
    }

    // Modular Inverse using Fermat's Little Theorem
    private long modInverse(long a, int mod) {
        return pow(a, mod - 2, mod);
    }

    // Fast Exponentiation
    private long pow(long base, int exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
