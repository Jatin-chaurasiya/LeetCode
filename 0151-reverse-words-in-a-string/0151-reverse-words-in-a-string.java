class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] word = str.split("\\s+");
        StringBuilder rev = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
          rev.append(word[i]);
          if(i != 0){
            rev.append(" ");
          }
        }
        return rev.toString();
    }
}