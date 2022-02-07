class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = helper(nums1, nums2);
        int m = res.length;
        if(m % 2 == 0){
            return (res[m/2] + res[(m-1)/2])/2.0;
        }else{
            return res[m/2];
        }
    }
    
    public int[] helper(int[] nums1, int[] nums2){
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            nums3[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++]; 
        }
        while(i < nums1.length){
            nums3[k++] = nums1[i++];
        }
        while(j < nums2.length){
            nums3[k++] = nums2[j++];
        }
        return nums3;
    }
}