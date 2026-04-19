class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),list,set);
        return list;
    }
    public void solve(int[] nums,int idx,List<Integer> op,List<List<Integer>> list,HashSet<String> set){
        if(idx == nums.length){
            String key = op.toString();
            if(!set.contains(key)){
                set.add(key);
                list.add(new ArrayList<>(op));
            }
          return;
        }

        op.add(nums[idx]);
        solve(nums,idx+1,op,list,set);

        op.remove(op.size()-1);

        solve(nums,idx+1,op,list,set);
    }
}