import java.util.Arrays;

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % k != 0) return false;

        int target = sum / k;

        // Optional optimization: sort in descending order
        Arrays.sort(nums);
        reverse(nums); // custom method to reverse the sorted array

        boolean[] used = new boolean[nums.length];
        return backtrack(nums, used, k, target, 0, 0);
    }

    private boolean backtrack(int[] nums, boolean[] used, int k, int target, int currSum, int start) {
        if (k == 0) return true;
        if (currSum == target) {
            // Start forming the next subset
            return backtrack(nums, used, k - 1, target, 0, 0);
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) continue;
            if (currSum + nums[i] > target) continue;

            used[i] = true;
            if (backtrack(nums, used, k, target, currSum + nums[i], i + 1)) return true;
            used[i] = false;

            // Optimization: skip duplicates or unnecessary branches
            if (currSum == 0) break; // If the first number doesn't fit, nothing else will
        }

        return false;
    }

    private void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
