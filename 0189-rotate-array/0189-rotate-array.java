class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int arr[]=new int[k%len];
        int idx=0;
        for(int i=len-(k%len);i<len;i++){
            arr[idx++]=nums[i];
        }
        int l=len-((k%len)+1),r=nums.length-1;
        while(l>=0){
            //swaping 
            nums[r--]=nums[l--];
        }
        int index=0;
        for(int i=0;i<k%len;i++){
            nums[index++]=arr[i];
        }
    }
}