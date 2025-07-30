class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         int used[]=new int[nums.length];
        backtrack(result, new ArrayList<>(), nums,used);
        return result;
    }
     private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums,int used[]) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // Add a copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // if (tempList.contains(nums[i])) continue; // Skip if already in the list
            if(used[i]==0){
                tempList.add(nums[i]);
                used[i]=1;
                backtrack(result, tempList, nums,used);
                tempList.remove(tempList.size() - 1); // Backtrack step
                used[i]=0;
            }
        }
    }
}