// int arr[]=new int[k%len];
//         int idx=0;
//         for(int i=len-(k%len);i<len;i++){
//             arr[idx++]=nums[i];
//         }
//         int l=len-((k%len)+1),r=nums.length-1;
//         while(l>=0){
//             //swaping 
//             nums[r--]=nums[l--];
//         }
//         int index=0;
//         for(int i=0;i<k%len;i++){
//             nums[index++]=arr[i];
//         }
class Solution {
    public static void reverse(int nums[],int l,int r){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        reverse(nums,0,len-1);
        reverse(nums,0,(k%len)-1);
        reverse(nums,k%len,len-1);
        
    }
}