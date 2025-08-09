class Solution {
      String[] MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int idx, StringBuilder path, List<String> result) {
        if (path.length()== digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = MAPPING[digits.charAt(idx) - '0'];
        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(digits, idx + 1, path, result);
            path.deleteCharAt(path.length() - 1);  // backtrack
        }
    }
}
