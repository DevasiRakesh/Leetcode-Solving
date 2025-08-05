class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> result=new ArrayList<>();
        String []str1=new String[str.length];
        boolean used[]=new boolean[str.length];
        for(int i=0;i<str.length;i++){
            String s=str[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // chars becomes ['a', 'b', 'c']
            str1[i]= new String(chars);
        }
        for(int i=0;i<str.length;i++){
            List<String> lst=new ArrayList<>();
            if(!used[i]){
                lst.add(str[i]);
                for(int j=i+1;j<str.length;j++){
                    if(!used[j]){
                        if(str1[i].equals(str1[j])){lst.add(str[j]);used[j]=true;}
                    }
                    
                }
                result.add(lst);
            }
        }
        return result;
    }
}