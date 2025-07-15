class Solution {
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public void sortColors(int[] nums) {
        // int arr[]=new int[3];
        // for(int i=0;i<nums.length;i++){arr[nums[i]]++;}
        // int val=0;
        // for(int i=0;i<nums.length;i++){
        //     if(arr[val]==0){while(arr[val]==0){val++;}}
        //     nums[i]=val;
        //     arr[val]--;

        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){swap(nums,mid,low);low++;mid++;}
            else if(nums[mid]==1){mid++;}
            else{swap(nums,mid,high);high--;}
        }
            
        
    }
}