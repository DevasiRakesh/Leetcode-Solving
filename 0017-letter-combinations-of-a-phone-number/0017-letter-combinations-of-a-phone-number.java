class Solution {
    public static void backtrack(List<String> result,List<String> lst,int idx,String str){
        if(idx==lst.size()){
            result.add(str);return;
        }
        String s=lst.get(idx);
        for(char ch:s.toCharArray()){
            // str+=ch;
            backtrack(result,lst,idx+1,str+ch);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        List<String> digitsChar=new ArrayList<>();
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        if(digits.length()==0){return result;}
        for(char ch:digits.toCharArray()){
            if(map.containsKey(ch-'0')){digitsChar.add(map.get(ch-'0'));}
        }
        backtrack(result,digitsChar,0,new String());
        return result;
    }
}