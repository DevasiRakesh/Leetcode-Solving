class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char c:s.toCharArray()){map.put(c,map.getOrDefault(c,0)+1);}
        // for(char c:t.toCharArray()){
        //     if(map.containsKey(c)){
        //         map.put(c,map.get(c)-1);
        //         if(map.get(c)==0){map.remove(c);}
        //     }else{return false;}
        // }
        // return map.size()==0;
         if (s.length() != t.length()) return false;

        int[] count = new int[26]; // For a-z only

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int n : count) {
            if (n != 0) return false;
        }

        return true;
    }
}