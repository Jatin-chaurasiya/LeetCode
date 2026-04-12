class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        
        for(String s : strs){
            char[] str = s.toCharArray();

            Arrays.sort(str);
            String val = String.valueOf(str);
            if(!mp.containsKey(val)){
              List<String> list = new ArrayList<>();
              list.add(s);
              mp.put(val,list);
            }else{
            mp.get(val).add(s);
            }
        }
        return new ArrayList<>(mp.values());
    }
}