class Solution {
    public static void findSubset(List<List<Integer>> result,List<Integer> list,int num[],int i, boolean isPicked){
        if(i==num.length){
            // if(!result.contains(list))result.add(new ArrayList<>(list));return;
            result.add(new ArrayList<>(list));return;
            }
            findSubset(result,list,num,i+1,false);
        if(i>= 1 && num[i-1] == num[i] && !isPicked) {
            return;
        }
        list.add(num[i]);
        findSubset(result,list,num,i+1,true);
        list.remove(list.size()-1);
        

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> result=new ArrayList<>();
        findSubset(result,new ArrayList<>(),nums,0,true);
        return result;
    }
}