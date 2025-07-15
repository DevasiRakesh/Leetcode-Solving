class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        for(int i=0;i<nums.length;i++){arr[nums[i]]++;}
        for(int i=0;i<3;i++){System.out.print(arr[i]+" ");}
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(arr[val]==0){while(arr[val]==0){val++;}}
            nums[i]=val;
            arr[val]--;
            
        }
    }
}