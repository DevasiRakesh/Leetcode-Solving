class Solution {
    public static void findSubset(List<List<Integer>> result,List<Integer> list,int num[],int i){
        if(i==num.length){
            if(!result.contains(list))result.add(new ArrayList<>(list));return;}
        list.add(num[i]);
        findSubset(result,list,num,i+1);
        list.remove(list.size()-1);
        findSubset(result,list,num,i+1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> result=new ArrayList<>();
        findSubset(result,new ArrayList<>(),nums,0);
        return result;
    }
}