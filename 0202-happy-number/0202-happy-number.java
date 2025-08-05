class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        while(n>0){
            int ud=n%10;
            sum+=ud*ud;
            n/=10;
            if(n==0){
                if(sum==1){return true;}
                else if(!set.contains(sum)){set.add(sum);n=sum;sum=0;}
                else{return false;}
            }
        }
        return true;
    }
}