class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),s,0);
        return result;
    }
    public static void backtrack(List<List<String>> result,List<String> lst,String s,int idx){
        if(idx==s.length()){result.add(new ArrayList<>(lst));return ;}
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                lst.add(s.substring(idx,i+1));
                backtrack(result,lst,s,i+1);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){return false;}
        }
        return true;
    }
}