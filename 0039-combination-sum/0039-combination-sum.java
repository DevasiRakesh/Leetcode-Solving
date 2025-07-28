class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);                          // Choose
            backtrack(candidates, target - candidates[i], i, tempList, result); // Not i+1 because we can reuse same number
            tempList.remove(tempList.size() - 1);                 // Backtrack
        }
    }
}