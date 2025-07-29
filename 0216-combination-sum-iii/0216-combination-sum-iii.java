class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int k, int n, int start) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) break; // Prune: No need to continue if i exceeds remaining sum
            path.add(i);
            backtrack(result, path, k - 1, n - i, i + 1);
            path.remove(path.size() - 1); // Backtrack
        }
    }
}