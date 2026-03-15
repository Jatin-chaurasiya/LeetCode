class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        int ans = 0;
        for(int k=1; ;k++){
            int start = (int) Math.pow(10,3*k);
            if(start > n) break;
            ans += (n - start + 1);
        }
        return ans;
    }
}