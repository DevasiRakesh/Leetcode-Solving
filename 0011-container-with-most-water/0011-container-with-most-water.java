class Solution {
    public int maxArea(int[] height) {
        int l=0,maxWaterStore=0;
        for(int r=1;r<height.length;r++){
            int minHeight=Math.min(height[l],height[r]);
            maxWaterStore=Math.max(minHeight*(r-l),maxWaterStore);
            if(height[l]<height[r]){
                int idx=r+1;
                while(idx<height.length){
                    int minHeight1=Math.min(height[l],height[idx]);
                    maxWaterStore=Math.max(minHeight1*(idx-l),maxWaterStore);
                    idx++;
                }
                l=r;
            }
        }
        return maxWaterStore;
    }
}