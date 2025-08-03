class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result=new ArrayList<>();
        backtrack(result,"",num,target,0,0,0);
        return result;
    }
    public static void backtrack(List<String> result,String path,String num,int target,int pos,long eval,long multed){
        if(pos==num.length()){
            if(eval==target){result.add(path);}
            return;
        }
        for(int i=pos;i<num.length();i++){
            if(i!=pos && num.charAt(i)==0){break;}
            String currStr=num.substring(pos,i+1);
            long currNum=Long.parseLong(currStr);
            if(pos==0){
                backtrack(result,path+currNum,num,target,i+1,currNum,currNum);
            }else{
                backtrack(result,path +"+"+currNum,num,target,i+1,eval+currNum,currNum);
                backtrack(result,path +"-"+currNum,num,target,i+1,eval-currNum,-currNum);
                backtrack(result,path +"*"+currNum,num,target,i+1,eval-multed+multed*currNum,multed*currNum);
            }
        }
    }
}