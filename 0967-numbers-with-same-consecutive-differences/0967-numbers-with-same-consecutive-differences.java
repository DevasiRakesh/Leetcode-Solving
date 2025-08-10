import java.util.*;

class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> result = new ArrayList<>();

        // Start numbers from 1 to 9 (no leading zeros)
        for (int i = 1; i <= 9; i++) {
            dfs(n - 1, k, i, result);
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private void dfs(int remainingDigits, int k, int currentNum, List<Integer> result) {
        if (remainingDigits == 0) {
            result.add(currentNum);
            return;
        }

        int lastDigit = currentNum % 10;

        // Try next digit = lastDigit + k
        if (lastDigit + k <= 9) {
            dfs(remainingDigits - 1, k, currentNum * 10 + (lastDigit + k), result);
        }

        // Try next digit = lastDigit - k (only if k != 0 to avoid duplicate paths)
        if (k != 0 && lastDigit - k >= 0) {
            dfs(remainingDigits - 1, k, currentNum * 10 + (lastDigit - k), result);
        }
    }
}
