class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,target,candidates);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> lst,int idx,int target,int candidates[]){
        if(target==0){
            result.add(new ArrayList<>(lst));
            return ;
        }
        if(target<2) return;
        for(int i=idx;i<candidates.length;i++){
            lst.add(candidates[i]);
            backtrack(result,lst,i,target-candidates[i],candidates);
            lst.remove(lst.size()-1);
        }
    }
}