class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                while(s.charAt(i)!=s.charAt(j)){
                    map.remove(s.charAt(i));
                    i++;
                }
                map.remove(s.charAt(i));
                i++;
            }
            map.put(s.charAt(j),j);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}