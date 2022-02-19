class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                res = Math.max(res, i);
            }
        }
        return res;
    }
}