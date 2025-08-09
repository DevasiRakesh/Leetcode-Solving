class Solution {
    public static void findSubset(List<List<Integer>> result,List<Integer> list,int num[],int i, boolean used[]){
        if(i==num.length){
            result.add(new ArrayList<>(list));return;
            }
        findSubset(result,list,num,i+1,used);
        if(i>= 1 && num[i-1] == num[i] && !used[i-1]) {
            return;
        }
        list.add(num[i]);
        used[i]=true;
        findSubset(result,list,num,i+1,used);
        list.remove(list.size()-1);
        used[i]=false;

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> result=new ArrayList<>();
         boolean used[]=new boolean[nums.length];
        findSubset(result,new ArrayList<>(),nums,0,used);
        return result;
    }
}