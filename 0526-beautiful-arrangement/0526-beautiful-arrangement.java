class Solution {
    public int countArrangement(int n) {
        boolean used[]=new boolean[n+1];
        return backtrack(1,n,used);
    }
    public static int backtrack(int pos,int n,boolean used[]){
        if(pos>n){return 1;}
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(!used[i] && (i%pos==0 || pos%i==0)){
                used[i]=true;
               cnt+= backtrack(pos+1,n,used);
                used[i]=false;
            }
        }
        return cnt;
    }
}