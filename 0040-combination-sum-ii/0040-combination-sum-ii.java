class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,0,new ArrayList<>(),target,candidates);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,int idx,List<Integer> lst,int k,int num[]){
        if(k==0){
             result.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<num.length;i++){
           if (i > idx && num[i] == num[i - 1]) continue; // skip duplicates

            if (num[i] > k) break; // no need to continue if current num is greater
                lst.add(num[i]);
                backtrack(result,i+1,lst,k-num[i],num);
                lst.remove(lst.size()-1);
        }
    }
}