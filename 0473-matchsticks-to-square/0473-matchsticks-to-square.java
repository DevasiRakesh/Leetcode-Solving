class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int stick : matchsticks) {
            sum += stick;
        }
        
        // Total sum must be divisible by 4
        if (sum % 4 != 0) return false;
        
        int side = sum / 4;
        
        // Sort descending to speed up pruning
        Arrays.sort(matchsticks);
        for (int i = 0; i < matchsticks.length / 2; i++) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[matchsticks.length - 1 - i];
            matchsticks[matchsticks.length - 1 - i] = temp;
        }
        
        int[] sides = new int[4]; // Represents 4 sides of the square
        
        return backtrack(matchsticks, 0, sides, side);
    }

    private boolean backtrack(int[] matchsticks, int index, int[] sides, int target) {
        if (index == matchsticks.length) {
            // All matchsticks used, check if all sides equal target
            return sides[0] == target && sides[1] == target &&
                   sides[2] == target && sides[3] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sides[i] + matchsticks[index] <= target) {
                sides[i] += matchsticks[index];
                if (backtrack(matchsticks, index + 1, sides, target)) return true;
                sides[i] -= matchsticks[index]; // backtrack
            }
        }

        return false;
    }
}