class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int a[]={0};
        backtrack(new ArrayList<>(),nums,target,0,a,0);
       return a[0];
    }
    public static void backtrack(List<Integer> lst,int nums[],int tar,int total,int a[],int idx){
        if(lst.size()==nums.length && total==tar){
            a[0]=a[0]+1;
            return ;
        }
        for(int i=idx;i<nums.length;i++){
                lst.add(nums[i]);
                backtrack(lst,nums,tar,total+nums[i],a,i+1);
                lst.remove(lst.size()-1);
                lst.add(-nums[i]);
                backtrack(lst,nums,tar,total-nums[i],a,i+1);
                lst.remove(lst.size()-1);
        }
    }
}