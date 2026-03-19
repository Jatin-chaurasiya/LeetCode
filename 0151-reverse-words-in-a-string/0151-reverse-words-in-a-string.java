class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] word = str.split("\\s+");
        String rev = "";
        for(int i=word.length-1;i>=0;i--){
          rev += word[i]+" ";
        }
        String str1 = rev.trim();
        return str1;
    }
}