class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}