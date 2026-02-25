class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i=0,j=0,count=0;
        Set<Character> str = new HashSet<>();
        while(j<n){
            if(!str.contains(s.charAt(j))){
                str.add(s.charAt(j));
                count = Math.max(count,j-i+1);
                j++;
            }else{
                str.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}