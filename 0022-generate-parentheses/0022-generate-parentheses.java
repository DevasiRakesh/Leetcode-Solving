class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(result,new StringBuilder(""),n,0,0);
        return result;
    }
    // tc=(4^n)*(n^(1/2))
    public static void backtrack(List<String >result ,StringBuilder str,int n,int x,int y){
        if(x==n && y==x){
            result.add(str.toString());
            return ;
        }
        if(x<n){str.append("(");backtrack(result,str,n,x+1,y); str.deleteCharAt(str.length()-1);}
        if(y<x){str.append(")"); backtrack(result,str,n,x,y+1);str.deleteCharAt(str.length()-1);}
    }
}