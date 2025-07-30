class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),1,k,n);
        return result;
    }
    public static void backtrack(List<List<Integer>>result,List<Integer> lst,int idx,int k,int n){
        if(n==0 && k==0){
            result.add(new ArrayList<>(lst));
            return ;
        }
        for(int i=idx;i<9;i++){
            if(i>n){return ;}
            lst.add(i);
            backtrack(result ,lst,i+1,k-1,n-i);
            lst.remove(lst.size()-1);
        }
    }
}