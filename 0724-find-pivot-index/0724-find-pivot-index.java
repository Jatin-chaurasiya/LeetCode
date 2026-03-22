class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int sumLeft = 0;
        for(int i=0;i<nums.length;i++){
            int sumRight = total-sumLeft-nums[i];

            if(sumRight == sumLeft){
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}