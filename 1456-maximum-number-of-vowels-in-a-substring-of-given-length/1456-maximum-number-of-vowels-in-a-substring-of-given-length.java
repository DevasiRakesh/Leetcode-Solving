class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');set.add('i');set.add('o');set.add('u');
        int max=0,cnt=0;
        for(int i=0;i<k;i++){if(set.contains(s.charAt(i)))cnt++;}
        max=cnt;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i)))cnt++;
            if(set.contains(s.charAt(i-k)))cnt--;
            max=Math.max(max,cnt);
        }
        return max;
    }
}