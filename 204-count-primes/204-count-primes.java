class Solution {
    public int countPrimes(int n) {
        boolean[] table = new boolean[n];
        Arrays.fill(table, true);
        
        for(int i = 2; i*i < n; i++){
            for(int j = i; j*i < n; j++){
                if(table[i]){
                    table[i*j] = false;
                }
            }
        }
         int count = 0;
            for(int i = 2; i< table.length; i++){
                if(table[i]){
                    count++;
            }
        }
        return count;
    }
}