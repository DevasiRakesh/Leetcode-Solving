class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int a[]={0};
        backtrack(nums,target,0,a,0);
       return a[0];
    }
    public static void backtrack(int nums[],int tar,int total,int a[],int idx){
        if(idx==nums.length){
            if( total==tar){a[0]=a[0]+1;}
            
            return ;
        }
         backtrack(nums,tar,total+nums[idx],a,idx+1);
         backtrack(nums,tar,total-nums[idx],a,idx+1);
        }
 }