class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i) == i){
             res = Math.max(res, i);
            }
        }
        return res;
    }
}