class Solution {
    public int countNumbersWithUniqueDigits(int n) {
         if (n == 0) return 1;  // Only number is 0

        int result = 10;  // For n = 1 → 0 to 9
        int uniqueDigits = 9; // choices for first digit (1–9)
        int available = 9;    // remaining digits (excluding first one)

        for (int i = 2; i <= n && available > 0; i++) {
            uniqueDigits *= available;
            result += uniqueDigits;
            available--;
        }

        return result;
    }
}