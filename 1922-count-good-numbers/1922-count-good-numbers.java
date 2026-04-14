class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1)/2;
        long odd = (n/2);

        long answer =  (power(5,even) * power(4,odd)) % mod;

        return (int)answer;
    }
    public long power(long x , long n){
        if(n == 0) return 1;

        long half = power(x,n/2);

        if(n % 2 == 0){
            return (half * half) % mod;
        }else{
            return ((x * half )% mod * half % mod) % mod;
        }
    }
}