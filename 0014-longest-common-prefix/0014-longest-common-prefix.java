class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(strs.length == 0) return "";
        String start = strs[0];
        for(int i=0;i<n;i++){
            String current = strs[i];
            while(current.indexOf(start) != 0){
                start = start.substring(0,start.length()-1);
            }
        }
        return start;
    }
}