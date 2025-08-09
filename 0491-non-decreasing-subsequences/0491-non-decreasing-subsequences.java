class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() >= 2) {
            result.add(new ArrayList<>(current));
        }

        // Use a set to avoid duplicates at the current level
        Set<Integer> used = new HashSet<>();

        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                used.add(nums[i]);
                current.add(nums[i]);
                backtrack(nums, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
