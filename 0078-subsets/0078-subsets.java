class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        solve(nums,0,new ArrayList<>(),list);
        return list;
    }
    public static void solve(int[] nums,int idx,List<Integer> list1,List<List<Integer>> list){
        if(idx == nums.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[idx]);
        solve(nums,idx+1,list1,list);
        
        list1.remove(list1.size() - 1);

        solve(nums,idx+1,list1,list);
    }
}