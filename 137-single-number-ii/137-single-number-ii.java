class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int num: nums){
            res.put(num, res.getOrDefault(num, 0)+1);
        }
        
        for(int k : res.keySet()){
            if(res.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}