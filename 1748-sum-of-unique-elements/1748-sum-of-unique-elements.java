class Solution {
    public int sumOfUnique(int[] nums) {
        
        Map<Integer, Integer> res= new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!res.containsKey(nums[i])){
                res.put(nums[i], 1);
            }else{
                res.put(nums[i], res.get(nums[i])+1);
            }
        }
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(res.get(nums[i])==1){
                sum += nums[i];
            }
        }
        return sum;
    }
}