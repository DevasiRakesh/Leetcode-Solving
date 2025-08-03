class Solution {
    public int calculate(String s) {
        int sum=0,num=0,sign=1;
        Stack<Integer> stack=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='+'){
                sum+=sign*num;
                sign=1;
                num=0;
            }else if(c=='-'){
                sum+=sign*num;
                sign=-1;
                num=0;
            }else if(c=='('){
                stack.push(sum);
                stack.push(sign);
                sum=0;
                sign=1;
            }else if(c==')'){
                sum+=sign*num;
                sum*=stack.pop();
                sum+=stack.pop();
                sign=1;
                num=0;
            }
        }
        if(num!=0){sum+=sign*num;}
        return sum;
    }
}
