class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n <= 0) return 0;
        int jump = 0;
        int maxJump = 0;
        int mid = 0;
        for(int i=0;i<nums.length;i++){
           if(i == n-1) return jump;
           maxJump = Math.max(maxJump,i+nums[i]);

           if(i == mid){
            jump++;
            mid = maxJump;
           }
        }
        return maxJump;
    }
}