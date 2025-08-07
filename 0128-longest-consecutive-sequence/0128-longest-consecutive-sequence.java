class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int lngStreak = 0;

        // Iterate over unique numbers only
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                lngStreak = Math.max(currStreak, lngStreak);
            }
        }

        return lngStreak;
    }
}
