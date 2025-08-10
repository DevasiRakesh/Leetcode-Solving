class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        backtrack(result,new StringBuilder(),s,0);
        return result;
    }
    public static void backtrack(List<String> result,StringBuilder str,String s,int idx){
        if(idx==s.length()){result.add(str.toString()); return;}
        if(Character.isDigit(s.charAt(idx))){
            str.append(s.charAt(idx));
            backtrack(result,str,s,idx+1);
            str.deleteCharAt(str.length()-1);
        }
        else{
             str.append(Character.toLowerCase(s.charAt(idx)));
                                backtrack(result,str,s,idx+1);
                                str.deleteCharAt(str.length()-1);
                                str.append(Character.toUpperCase(s.charAt(idx)));
                                backtrack(result,str,s,idx+1);
                                str.deleteCharAt(str.length()-1);
        }
       
    }
}