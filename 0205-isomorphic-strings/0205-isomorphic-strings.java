class Solution {
    public boolean isIsomorphic(String s, String t) {
    //     HashMap<Character,Character> map=new HashMap<>();
    //     map.put(s.charAt(0),t.charAt(0));
    //     for(int i=1;i<s.length();i++){
    //         if( (s.charAt(i-1)==s.charAt(i) || t.charAt(i-1)==t.charAt(i))){
    //             if(s.charAt(i-1)==s.charAt(i) &&  t.charAt(i-1)==t.charAt(i)){continue;}
    //             else{return false;}
    //         }else if(map.containsKey(s.charAt(i))){
    //             if(t.charAt(i)!=map.get(s.charAt(i))){return false;}
    //         }else{
    //             if(map.containsValue(t.charAt(i))){return false;}
    //             map.put(s.charAt(i),t.charAt(i));
    //         }
    //     }
    //     return true;
    // }
    HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (mappedValues.contains(c2)) return false;
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }

        return true;
    }
}