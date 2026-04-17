class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=k;i>=0;i--){
           return nums[n-k];
        }
        return -1;
    }
}