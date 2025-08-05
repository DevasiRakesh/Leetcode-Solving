class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for(int i=0;i<baskets.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]!=0){
                    if(fruits[i]<=baskets[j]){baskets[j]=0;break;}  
                }
            }
        }
        int cnt=0;
        for(int i=0;i<baskets.length;i++){
            if(baskets[i]!=0){cnt++;}
            // System.out.print(baskets[i]+" ");
        }
        return cnt;
    }
}