class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>nums.length/3){lst.add(key);}
        }
        return lst;
    }
}