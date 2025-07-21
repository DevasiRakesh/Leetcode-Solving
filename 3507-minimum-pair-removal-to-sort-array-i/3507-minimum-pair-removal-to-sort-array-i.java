class Solution {
    public int minimumPairRemoval(int[] nums) {
        int len=nums.length,cnt=0;
        for(int i=len-1;i>=1;i--){
            if(nums[i]<nums[i-1]){
                nums[i-1]=nums[i]+nums[i-1];
                System.out.println(nums[i-1]);cnt++;}
        }
        return cnt;
    }
}