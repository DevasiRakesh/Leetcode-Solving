class Solution {
    public boolean makesquare(int[] matchsticks) {
     int sum =0;
        for(int stick : matchsticks){
            sum+= stick;
        }
        if(sum%4 != 0)return false;
        int target = sum/4;
        Arrays.sort(matchsticks);
        int length = matchsticks.length;
        if(matchsticks[length-1]>target) return false;
        boolean[] used = new boolean[length];
        return backtrack(matchsticks, target, 0, used, 0,4);

    }

    private boolean backtrack(int[] matchsticks, int target, int start, boolean[] used, int total, int buckets){
        if(buckets==0)return true;
        if(total==target){
            return backtrack(matchsticks,target, 0, used,0,buckets-1);
        }
        for(int i = start; i<matchsticks.length; i++){
            if(used[i])continue;
            if(matchsticks[i]+total>target) break;
            // if(i>0 && matchsticks[i]==matchsticks[i-1]&& !used[i-1]) continue;
            used[i]=true;
            if(backtrack(matchsticks, target, i+1, used, total+matchsticks[i], buckets)) return true;
            used[i] = false;
            if (total == 0) break;


        }
        return false;


    }
}