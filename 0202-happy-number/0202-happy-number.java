class Solution {
    public boolean isHappy(int n) {
    //     int sum=0;
    //     HashSet<Integer> set=new HashSet<>();
    //     set.add(n);
    //     while(n>0){
    //         int ud=n%10;
    //         sum+=ud*ud;
    //         n/=10;
    //         if(n==0){
    //             if(sum==1){return true;}
    //             else if(!set.contains(sum)){set.add(sum);n=sum;sum=0;}
    //             else{return false;}
    //         }
    //     }
    //     return true;
    // }
    Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }

        return n == 1;
    }

    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}