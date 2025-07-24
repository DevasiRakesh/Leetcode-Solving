class Solution {
    private int idx = 0; // non-static instance variable
    public String decodeString(String s) {
        idx = 0; // reset idx before each use
        return dfs(s);
    }
    public  String dfs(String s) {
        StringBuilder result = new StringBuilder();

        while (idx < s.length()) {
            char ch = s.charAt(idx);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }

                idx++; // Skip '['
                String decoded = dfs(s);
                idx++; // Skip ']'

                for (int i = 0; i < num; i++) {
                    result.append(decoded);
                }
            } else if (ch == ']') {
                break;
            } else {
                result.append(ch);
                idx++;
            }
        }

        return result.toString();
    }
}
