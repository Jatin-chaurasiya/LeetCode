class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int n = nums.length;
       HashMap<Integer,Integer> mp = new HashMap<>();
       mp.put(0,1);
       int sum = 0;
       int count = 0;
       for(int num : nums){
        sum += num;      
        int mod = ((sum % k)+k)%k;
        if(mp.containsKey(mod)){
            count += mp.get(mod);
        }
        mp.put(mod,mp.getOrDefault(mod,0)+1);

       }
        return count;
    }
}