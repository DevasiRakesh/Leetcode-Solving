class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(s.charAt(0),t.charAt(0));
        for(int i=1;i<s.length();i++){
            if( (s.charAt(i-1)==s.charAt(i) || t.charAt(i-1)==t.charAt(i))){
                if(s.charAt(i-1)==s.charAt(i) &&  t.charAt(i-1)==t.charAt(i)){continue;}
                else{return false;}
            }else if(map.containsKey(s.charAt(i))){
                if(t.charAt(i)!=map.get(s.charAt(i))){return false;}
            }else{
                if(map.containsValue(t.charAt(i))){return false;}
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}