class Solution {
    public long[] sumOfThree(long num) {
        long arr[]=new long[3];
        if(num%3==0){
            long mid=num/3;
            arr[0]=mid-1;
            arr[1]=mid;
            arr[2]=mid+1;
        }else {
            return new long[0];
        }
        return arr;
        
    }
}