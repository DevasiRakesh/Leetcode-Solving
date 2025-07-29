class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lst=new ArrayList<>();
        backtrack(lst,new ArrayList<>(),0,s);
        return lst;
    }
    public static void backtrack(List<List<String>> result,List<String> list,int idx,String s){
        if(idx==s.length()){result.add(new ArrayList<>(list));return ;}
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                list.add(s.substring(idx,i+1));
                backtrack(result,list,i+1,s);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str,int l,int r){
        while(l<r){
            if(str.charAt(l++)!=str.charAt(r--)){return false;}
        }
        return true;
    }
}