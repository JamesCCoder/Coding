class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int cur = lower;
        
        for(int num: nums){
            if(cur == num){
                cur++;
            }else if(cur < num){
                if(cur + 1 == num){
                    res.add(String.valueOf(cur));
                }else{
                    res.add(cur + "->" + (num-1));
                }
            }
            cur = num + 1;
        }
        
        if(cur == upper){
            res.add(String.valueOf(cur));
        }else if(cur < upper){
            res.add(cur + "->" + upper);
        }
        return res;
    }
}