class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int j=0,i=0;
        while(j<nums.length){
            if(!map.containsKey(nums[j])){
                map.put(target-nums[j],j);
            }else{
                arr[0]=map.get(nums[j]);
                arr[1]=j;
                break;
            }
            j++;
        }
        return arr;
    }
}