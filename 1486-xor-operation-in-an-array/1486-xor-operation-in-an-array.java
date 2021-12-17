class Solution {
    public int xorOperation(int n, int start) {
        int[] num = new int[n];
        int res = 0;
        for(int i = 0;i<n;i++){
            num[i] = start + 2*i;
            res = res ^ num[i];
        }
        return res;
        
        
    }
}