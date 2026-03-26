class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxP = Integer.MIN_VALUE;
        int product = 1;
        for(int i=0;i<n;i++){
            product = 1;
            for(int j=i;j<n;j++){
               product *= nums[j];

               maxP = Math.max(maxP,product);
            }
        }
        return maxP;
    }
}