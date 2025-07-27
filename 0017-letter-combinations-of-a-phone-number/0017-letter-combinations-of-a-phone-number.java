class Solution {
       private void backtrack(List<String> digitChars, int index, StringBuilder current, List<String> result) {
        if (index == digitChars.size()) {
            result.add(current.toString());
            return;
        }

        String letters = digitChars.get(index);
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digitChars, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);  // backtrack
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        // Convert digits to a list of character sets
        List<String> digitChars = new ArrayList<>();
        for (char digit : digits.toCharArray()) {
            if (map.containsKey(digit)) {
                digitChars.add(map.get(digit));
            }
        }

        backtrack(digitChars, 0, new StringBuilder(), result);
        return result;

    }
}