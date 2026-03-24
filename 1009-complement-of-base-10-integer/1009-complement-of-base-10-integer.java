class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        String res = "";
        for(char ch : str.toCharArray()){
            if(ch == '0') res = res.concat("1");
            else res = res.concat("0");
        }
        return Integer.parseInt(res,2);
    }
}