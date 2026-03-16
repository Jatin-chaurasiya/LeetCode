class Solution {
    public boolean canJump(int[] nums) {
      int distance = 0;
      for(int i=0;i<nums.length;i++){
        if(i > distance) return false;
        distance = Math.max(distance,i+nums[i]);
      }
      return  true;
    }
}