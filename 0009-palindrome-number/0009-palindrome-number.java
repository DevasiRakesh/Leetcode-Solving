class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){ return false;}
         int rev_no=0,org=x;
         while(x!=0){
            rev_no=rev_no*10+x%10;
            x/=10;
         }
         return (org == rev_no);
    }
}