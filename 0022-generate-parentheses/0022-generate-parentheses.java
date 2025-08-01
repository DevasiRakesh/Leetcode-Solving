class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(result,"",n,0,0);
        return result;
    }
    public static void backtrack(List<String >result ,String str,int n,int x,int y){
        if(str.length()==n*2){
            result.add(str);
            return ;
        }
        if(x<n){backtrack(result,str+"(",n,x+1,y);}
        if(y<x){backtrack(result,str+")",n,x,y+1);}
    }
}