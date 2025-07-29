class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result =new ArrayList<>();
        int nums[]=new int[9];
        for(int i=0;i<9;i++){nums[i]=i+1;System.out.print(nums[i]+" ");}
        backtrack(result,new ArrayList<>(),k,n,0,nums);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> list ,int k,int n,int idx,int nums[]){
        if(k==0 && n==0){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            if(n<nums[i]){continue;}
            list.add(nums[i]);
            backtrack(result,list,k-1,n-nums[i],i+1,nums);
            list.remove(list.size()-1);
        }

    }
}