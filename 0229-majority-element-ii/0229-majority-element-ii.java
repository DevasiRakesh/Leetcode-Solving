class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> lst=new ArrayList<>();
        // int cnt1=0,cnt2=0,cd1=0,cd2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(cnt1==0){
        //         cnt1=1;cd1=nums[i];
        //     }else if(cnt2==0){
        //         cnt2=1;cd2=nums[i];
        //     }else if(cd1==nums[i]){cnt1++;}
        //     else if(cd2==nums[i]){cnt2++;}
        //     else{cnt1--;cnt2--;}
        // }
        // cnt1=cnt2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==cd1){cnt1++;}
        //     else if(nums[i]==cd2){cnt2++;}
        // }
        // if(cnt1>nums.length/3){lst.add(cd1);}
        // if(cnt2>nums.length/3){lst.add(cd2);}
        // return lst;
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 1st Pass: Find potential candidates
        int candidate1 = 0, candidate2 = 0; // initialize with different numbers
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // 2nd Pass: Validate the candidates
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
}