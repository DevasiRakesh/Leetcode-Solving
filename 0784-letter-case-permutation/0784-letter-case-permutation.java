class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(res,0,s.toCharArray());
        return res;
    }

    public void backtrack(List<String> res, int i , char[] s){
        if(i==s.length) res.add(new String(s));

        else if(Character.isLetter(s[i])){
                s[i] = Character.toUpperCase(s[i]);
                backtrack(res,i+1,s);
                s[i] = Character.toLowerCase(s[i]);
                backtrack(res,i+1,s);
            }
            else{
                backtrack(res,i+1,s);
            }
        }
    }