class Solution {
    public int[] twoSum(int[] nums, int target) {       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};

        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int y = target - nums[i];
            if(mp.containsKey(y)){
                return new int[]{mp.get(y),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}