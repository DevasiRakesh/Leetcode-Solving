class Solution {
    public int countArrangement(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int used[]=new int[n];
        int a[]={0};
        backtrack(new ArrayList<>(),arr,n,used,a);
        return a[0];
    }
    public static void  backtrack(List<Integer> lst,int num[],int n,int used[],int a[]){
        if (lst.size() == n) {
            a[0] = a[0] + 1;
            // System.out.println(lst); // Optional: remove or keep as needed
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (used[i] == 0) {
                int pos = lst.size() + 1;
                if (num[i] % pos == 0 || pos % num[i] == 0) {  // ✅ Condition check added here
                    used[i] = 1;
                    lst.add(num[i]);
                    backtrack(lst, num, n, used, a);
                    lst.remove(lst.size() - 1);
                    used[i] = 0;
                }
            }
        }
    }
    // public static boolean isBeautifulArr(List<Integer> lst){
    //     int idx=0;
    //     while(idx<lst.size()){
    //         if(lst.get(idx) % (lst.size()+1)!=0 || (lst.size()+1) % lst.get(idx) !=0){return false;}
    //         idx++;
    //     }
    //     return true;
    // }
}