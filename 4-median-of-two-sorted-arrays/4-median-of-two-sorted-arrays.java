class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergedTwoArray(nums1, nums2);
        int n = mergedArray.length;
        if(n % 2 == 0){
            return (mergedArray[(n-1)/2] + mergedArray[n/2])/2.0;
        }else{
            return mergedArray[n/2];
        }
    }
    
    public int[] mergedTwoArray(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< nums1.length && j < nums2.length){
            merged[k] = nums1[i] < nums2[j]? nums1[i++] : nums2[j++];   
            k++;
        }
        while(i< nums1.length){
            merged[k++] = nums1[i++];
        }
        while(j< nums2.length){
            merged[k++] = nums2[j++];
        }
        return merged;
    }
}