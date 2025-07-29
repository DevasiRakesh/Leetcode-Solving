class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int used[]=new int[nums.length];
        backtrack(result,new ArrayList<>(),nums,used);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> list,int nums[],int used[]){
        if(list.size()==nums.length){
            if(!result.contains(list)){result.add(new ArrayList<>(list));}
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==0){
                list.add(nums[i]);
                used[i]=1;
                backtrack(result,list,nums,used);
                list.remove(list.size()-1);
                used[i]=0;
            }
        }
    }
}