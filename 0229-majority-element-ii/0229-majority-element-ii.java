class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==(nums.length/3) +1){lst.add(num);}

        }
        
        return lst;
    }
}