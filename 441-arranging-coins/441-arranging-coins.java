class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        
        while(l <= r){
            long m = (r - l)/2 + l;
            long cur = m*(m+1)/2;
        
        
        if(cur == n) return (int)m;
        
        if(n < cur){
            r = m - 1;
        }else{
            l = m + 1;
        }
        }
        return (int)r;
    }
}