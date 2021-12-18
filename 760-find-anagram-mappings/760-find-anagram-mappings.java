class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0; i< nums1.length; i++){
            for(int j = 0; j<nums1.length; j++){
                if(nums1[i] == nums2[j]){
                    res[i] = j;
                }
            }
        }
        return res;
    }
}