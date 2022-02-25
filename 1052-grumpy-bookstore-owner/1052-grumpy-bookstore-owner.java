class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for(int i = 0; i<customers.length; i++){
            if(grumpy[i] == 0){
                sum += customers[i];
                customers[i] = 0;
            }
        }
        
        int cur = 0;
        int max = 0;
        
        for(int l = 0, r = 0; r<customers.length; r++){
            cur += customers[r];
            if(r - l + 1 > minutes){
                cur -= customers[l++];
            }
            max = Math.max(max, cur);
        }
        return max + sum;
    }
}