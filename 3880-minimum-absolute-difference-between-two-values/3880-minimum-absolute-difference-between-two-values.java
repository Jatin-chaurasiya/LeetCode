class Solution {
    public int minAbsoluteDifference(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                mp.put(nums[i],i);
            }
            else if(nums[i] == 2){
                mp.put(nums[i],i);
            }
            if(mp.containsKey(1) && mp.containsKey(2)){
                minDiff = Math.min(minDiff,Math.abs(mp.get(1) - mp.get(2)));
            }
        }
        if(minDiff == Integer.MAX_VALUE){
            return -1;
        }
        return minDiff;
    }
}