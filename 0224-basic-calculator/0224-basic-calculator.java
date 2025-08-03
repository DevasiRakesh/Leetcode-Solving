class Solution {
    public int calculate(String s) {
        int idx=0,sum=0;
        char sign='+';
        while(idx<s.length()){
            char c=s.charAt(idx);
            if(Character.isWhitespace(c)){idx++;continue;}
            if(Character.isDigit(c)){
                int num=0;
                while(idx<s.length() && Character.isDigit(s.charAt(idx))){
                    num=num*10+(s.charAt(idx)-'0');
                    idx++;
                }
                if(sign=='+'){sum+=num;}
                else{sum-=num;}
                continue;
            }
            if(c=='+' || c=='-'){sign=c;}
            idx++;
        }
        return sum;
    }
}