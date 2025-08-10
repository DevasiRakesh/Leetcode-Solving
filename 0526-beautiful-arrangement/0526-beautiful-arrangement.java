class Solution {
    public int countArrangement(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int used[] = new int[n];
        int a[] = {0};
        backtrack(new ArrayList<>(), arr, n, used, a);
        return a[0];
    }

    public static void backtrack(List<Integer> lst, int num[], int n, int used[], int a[]) {
        if(lst.size()==n){a[0]+=1; return ;}
        for(int i=0;i<num.length;i++){
            if(used[i]==0){
                lst.add(num[i]);
                if(num[i]%lst.size() ==0 || lst.size() % num[i] ==0){
                    used[i]=1;
                    backtrack(lst,num,n,used,a);
                    used[i]=0;
                }
                lst.remove(lst.size()-1);
            }
        }
    }
}

