// int arr[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             arr[nums[i]]++;
//         }
//     for(int i=1;i<nums.length;i++){if(arr[i]>1){return i;}}
//         return 0;
class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Detect intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Phase 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}