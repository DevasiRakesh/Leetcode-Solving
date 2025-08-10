class Solution {
    public int numTilePossibilities(String tiles) {
        char ch[]=tiles.toCharArray();
        Arrays.sort(ch);
        String str=new String(ch);
        int a[]={0};
        boolean used[]=new boolean[str.length()];
        for(int i=1;i<=str.length();i++){
            dfs(str,used,i,a,"");
            System.out.println(a[0]);
        }
        return a[0];
    }
    public static void dfs(String str,boolean used[],int n,int a[],String s){
        if(s.length()==n){a[0]++;}
        for(int i=0;i<str.length();i++){
            if(used[i]) continue;
            if(i>0 && str.charAt(i-1)==str.charAt(i) && !used[i-1])continue;
            used[i]=true;
            dfs(str,used,n,a,s+str.charAt(i));
            used[i]=false;
        }
    }
}