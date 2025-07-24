class Solution {
    public String decodeString(String s) {
        return dfs(s,new int[]{0});
    }
    public static String dfs(String s,int[] idxRef){
        StringBuilder result=new StringBuilder();
        while(idxRef[0]<s.length()){
            char ch=s.charAt(idxRef[0]);
            if(Character.isDigit(ch)){
                int num=0;
                while(Character.isDigit(s.charAt(idxRef[0]))){
                    num=num*10 + s.charAt(idxRef[0])-'0';
                    idxRef[0]++;
                }
                idxRef[0]++;//skip '['
                String decode=dfs(s,idxRef);
                idxRef[0]++;//skip ']'
                for(int i=0;i<num;i++){result.append(decode);}
            }else if(ch==']'){break;}
            else{result.append(ch);idxRef[0]++;}
        }
        return result.toString();
    }
}
// public class Solution {
//     int idx = 0;

//     public String decodeString(String s) {
//         return dfs(s);
//     }

//     private String dfs(String s) {
//         StringBuilder result = new StringBuilder();

//         while (idx < s.length()) {
//             char c = s.charAt(idx);

//             if (Character.isDigit(c)) {
//                 int num = 0;
//                 while (Character.isDigit(s.charAt(idx))) {
//                     num = num * 10 + (s.charAt(idx) - '0');
//                     idx++;
//                 }

//                 idx++; // skip '['
//                 String decoded = dfs(s);
//                 idx++; // skip ']'

//                 for (int i = 0; i < num; i++) {
//                     result.append(decoded);
//                 }
//             } else if (c == ']') {
//                 break;
//             } else {
//                 result.append(c);
//                 idx++;
//             }
//         }

//         return result.toString();
//     }