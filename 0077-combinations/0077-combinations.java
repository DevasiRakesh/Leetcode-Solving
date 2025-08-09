class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),n,k,1);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> lst,int n,int k,int idx){
        if(k==0){
            result.add(new ArrayList<>(lst));
            return ;
        }
        for(int i=idx;i<=n;i++){
            lst.add(i);
            backtrack(result,lst,n,k-1,i+1);
            lst.remove(lst.size()-1);
        }
    }
}