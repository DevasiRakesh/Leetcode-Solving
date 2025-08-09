class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int used[]=new int[nums.length];
        backtrack(result,new ArrayList<>(),nums,used);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> lst,int num[],int used[]){
        if(lst.size()==num.length){
            result.add(new ArrayList<>(lst));
            return ;
        }
        for(int i=0;i<num.length;i++){
            if(used[i]==0){
                lst.add(num[i]);
                used[i]=1;
                backtrack(result,lst,num,used);
                lst.remove(lst.size()-1);
                used[i]=0;
            }
        }
    }
}