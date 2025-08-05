class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}