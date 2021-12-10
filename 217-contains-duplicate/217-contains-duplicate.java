class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> res = new HashSet<>();
        for(int x:nums){
            if(res.contains(x))
                return true;
            else
                res.add(x);
        }
        return false;
    }
}