class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0;
        for(int i=0;i<baskets.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]!=0){
                    if(fruits[i]<=baskets[j]){cnt++;baskets[j]=0;break;}  
                }
            }
        }
        return baskets.length-cnt;
    }
}