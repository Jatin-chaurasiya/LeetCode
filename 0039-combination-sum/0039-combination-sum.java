class Solution { 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        getAllCombination(candidates,0,target,list,new ArrayList<>(),set);
        return list;

    }
    public static void getAllCombination(int[] candidates,int i,int target,List<List<Integer>> list, List<Integer> combina,HashSet<List<Integer>> set){
        if(i == candidates.length || target < 0){
            return;
        }
        if(target == 0){
            List<Integer> temp = new ArrayList<>(combina);
            if(!set.contains(temp)){
                list.add(temp);
                set.add(temp);
            }
            return;
        }    
        combina.add(candidates[i]);
        getAllCombination(candidates,i+1,target - candidates[i],list,combina,set);
        getAllCombination(candidates,i,target - candidates[i],list,combina,set);
        combina.remove(combina.size()-1);
        getAllCombination(candidates,i+1,target,list,combina,set);
    }
}