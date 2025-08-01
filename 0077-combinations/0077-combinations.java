class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){arr[i]=i+1;}
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,k,arr);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> lst,int idx,int k,int arr[]){
        if(k==0){
            result.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            lst.add(arr[i]);
            backtrack(result,lst,i+1,k-1,arr);
            lst.remove(lst.size()-1);
        }
    }
}