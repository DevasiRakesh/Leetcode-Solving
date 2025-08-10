class Solution {
    public boolean reorderedPowerOf2(int n) {
         String target = sortDigits(n);
        
        for (int i = 0; i < 30; i++) {
            int powerOf2 = 1 << i;
            if (target.equals(sortDigits(powerOf2))) {
                return true;
            }
        }
        return false;
    }

    // Helper method to sort digits of a number and return as string
    private String sortDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}