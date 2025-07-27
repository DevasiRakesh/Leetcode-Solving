class Solution {
    public static void findSubset(List<List<Integer>> result,List<Integer> list,int num[],int i){
        if(i==num.length){
            List<Integer> list1=new ArrayList<>(list);
            Collections.sort(list1);
            if(!result.contains(list1))result.add((list1));return;}
        list.add(num[i]);
        findSubset(result,list,num,i+1);
        list.remove(list.size()-1);
        findSubset(result,list,num,i+1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> result=new ArrayList<>();
        findSubset(result,new ArrayList<>(),nums,0);
        return result;
    }
}