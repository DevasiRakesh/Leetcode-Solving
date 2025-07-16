class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
    for(int i=1;i<nums.length;i++){if(arr[i]>1){return i;}}
        return 0;
    }
}