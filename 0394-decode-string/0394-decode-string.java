public class Solution {
    int idx = 0;

    public String decodeString(String s) {
        return dfs(s);
    }

    private String dfs(String s) {
        StringBuilder result = new StringBuilder();

        while (idx < s.length()) {
            char c = s.charAt(idx);

            if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }

                idx++; // skip '['
                String decoded = dfs(s);
                idx++; // skip ']'

                for (int i = 0; i < num; i++) {
                    result.append(decoded);
                }
            } else if (c == ']') {
                break;
            } else {
                result.append(c);
                idx++;
            }
        }

        return result.toString();
    }
}
