class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int begin = lower;
        int end = upper;
        for(int num : nums){
            if(begin == num){
                begin++;
            }else if(begin < num){
                if(begin + 1 == num){
                    res.add(String.valueOf(begin));
                }else{
                    res.add(begin + "->" +(num - 1));
                }
                
                begin = num + 1;
            }
        }
        
        if(begin == upper){
            res.add(String.valueOf(begin));
        }else if(begin < end){
            res.add(begin + "->" + end);
        }
        return res;
    }
}