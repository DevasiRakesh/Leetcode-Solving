class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean check=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //     if(nums[i]==nums[j] && Math.abs(j-i)<=k){check=true;}
            // }
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<=k){check=true;}
            map.put(nums[i],i);
        }
        return check;
    }
}