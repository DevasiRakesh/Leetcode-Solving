class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // int s=0,e=nums.length-1;
        // while(s<e){
        //     if(nums[s]+nums[e]==target){num[0]=s;num[1]=e;}
        //     else if(nums[s]+nums[e] >target){e--;}
        //     else{s++;}
        // }
        // return num;
       HashMap<Integer,Integer> map = new HashMap<>();
       int num[]=new int[2];
       for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                num[0]=map.get(complement);
                num[1]=i;
                return num;
            }
            map.put(nums[i],i);
       }
       return num;
    }
}