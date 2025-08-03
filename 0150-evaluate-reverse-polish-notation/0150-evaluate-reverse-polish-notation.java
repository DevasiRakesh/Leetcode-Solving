class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+")){
                int v2=stack.pop();
                int v1=stack.pop();
                stack.push(v1+v2);
            }else if(str.equals("-")){
                int v2=stack.pop();
                int v1=stack.pop();
                stack.push(v1-v2);
            }else if(str.equals("/")){
                int v2=stack.pop();
                int v1=stack.pop();
                stack.push(v1/v2);
            }else if(str.equals("*")){
                int v2=stack.pop();
                int v1=stack.pop();
                stack.push(v1*v2);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}