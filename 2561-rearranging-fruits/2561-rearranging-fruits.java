class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:basket1){map.put(num,map.getOrDefault(num,0)+1);min=Math.min(num,min);}
        for(int num:basket2){map.put(num,map.getOrDefault(num,0)-1);min=Math.min(num,min);}
        List<Integer> lst=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int fruit = entry.getKey();
            int diff = Math.abs(entry.getValue());
            if (diff % 2 != 0) return -1; // Impossible to balance
            for (int i = 0; i < diff / 2; i++) {
                lst.add(fruit);
            }
        }
        Collections.sort(lst);
        long ans=0;
        for(int i=0;i<lst.size()/2;i++){
            ans+=Math.min(lst.get(i),min*2);
        }
        return ans;
    }
}