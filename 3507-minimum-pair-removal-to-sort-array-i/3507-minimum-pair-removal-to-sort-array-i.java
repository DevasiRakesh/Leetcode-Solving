class Solution {
    public static boolean hasInversion(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)) return true;
        }
        return false;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){list.add(i);}
        int idx=-1,sum=0,ans=0;
        while(hasInversion(list)){
            int len=list.size();
            int minSum=Integer.MAX_VALUE;
            for(int i=0;i<len-1;i++){
                sum=list.get(i)+list.get(i+1);
                if(sum<minSum){minSum=sum;idx=i;}
            }
            list.set(idx,minSum);
            list.remove(idx+1);
            ans++;
        }
        return ans;
    }
}