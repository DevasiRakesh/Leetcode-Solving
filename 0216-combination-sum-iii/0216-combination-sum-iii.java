class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),n,k,1);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> lst,int target,int k,int s){
        if(target==0 && k==0){
            result.add(new ArrayList<>(lst));
            return ;
        }
        for(int i=s;i<=9;i++){
            if(target<i){return;}
            lst.add(i);
            backtrack(result,lst,target-i,k-1,i+1);
            lst.remove(lst.size()-1);
        }
    }
}