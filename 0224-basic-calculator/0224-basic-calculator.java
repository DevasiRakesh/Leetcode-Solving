class Solution {
    public int calculate(String s) {
        // int idx=0,sum=0;
        // char sign='+';
        // while(idx<s.length()){
        //     char c=s.charAt(idx);
        //     if(Character.isWhitespace(c)){idx++;continue;}
        //     if(Character.isDigit(c)){
        //         int num=0;
        //         while(idx<s.length() && Character.isDigit(s.charAt(idx))){
        //             num=num*10+(s.charAt(idx)-'0');
        //             idx++;
        //         }
        //         if(sign=='+'){sum+=num;}
        //         else{sum-=num;}
        //         continue;
        //     }
        //     if(c=='+' || c=='-'){sign=c;}
        //     idx++;
        // }
        // return sum;
    int sum = 0;
        int sign = 1; // +1 or -1
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // handle multi-digit numbers
            } else if (ch == '+') {
                sum += sign * num;
                sign = 1;
                num = 0;
            } else if (ch == '-') {
                sum += sign * num;
                sign = -1;
                num = 0;
            } else if (ch == '(') {
                // Push the current state
                stack.push(sum);
                stack.push(sign);
                // Reset for new expression
                sum = 0;
                sign = 1;
            } else if (ch == ')') {
                sum += sign * num;
                num = 0;
                sum *= stack.pop(); // pop sign
                sum += stack.pop(); // pop previous sum
            } // ignore whitespace
        }

        // Add the last number
        if (num != 0) {
            sum += sign * num;
        }

        return sum;
    }
}