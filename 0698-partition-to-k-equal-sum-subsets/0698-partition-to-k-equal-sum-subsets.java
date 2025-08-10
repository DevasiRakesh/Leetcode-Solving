class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int used[]=new int[nums.length];
        int sum=0;
        for(int n:nums){sum+=n;}
        if(sum%k!=0){return false;}
        return backtrack(used,nums,k,sum/k,0,0);
        
    }
    public static boolean backtrack(int used[],int nums[],int k,int tar,int total,int idx){
        if(k==0){return true;}
        if(total==tar){return backtrack(used,nums,k-1,tar,0,0);}
        for(int i=idx;i<nums.length;i++){
            if(used[i]==0){
                if (total + nums[i] > tar) continue;
                used[i]=1;
                if(backtrack(used,nums,k,tar,total+nums[i],i+1)){return true;}
                used[i]=0;
            }
        }
        return false;
    }
}