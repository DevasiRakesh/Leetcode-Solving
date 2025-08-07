class Solution {
    public int majorityElement(int[] nums) {
        // moore voting algrorithm
       int cnt=0,el=-1;
       for(int i=0;i<nums.length;i++){
        if(cnt==0){cnt=1;el=nums[i];}
        else if(el==nums[i]){cnt++;}
        else{cnt--;}
       }
    //    cnt=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==el){cnt++;}
    //    }
    //    if(cnt>nums.length/2){return el;}
       return el;
    }
}