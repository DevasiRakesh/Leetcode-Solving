class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates easily
        boolean used[]=new boolean[candidates.length];
        backtrack(result, new ArrayList<>(), candidates, target, 0,used);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int remain, int start,boolean used[]) {
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
             if (candidates[i] > remain) return;// arr is sort
            // Skip duplicates (important)
            if (i > s && candidates[i] == candidates[i - 1] ) continue;  
            // used[i]=true;
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, remain - candidates[i], i + 1,used); // i + 1: don't reuse
            temp.remove(temp.size() - 1); // Backtrack
            // used[i]=false;
        }
    }
}
