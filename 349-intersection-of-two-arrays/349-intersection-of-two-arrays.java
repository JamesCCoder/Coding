class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        
        for(int i = 0;i<nums1.length; i++){
            h.put(nums1[i], h.getOrDefault(nums1[i], 0) + 1);
        }
        
        for(int i = 0;i<nums2.length; i++){
            if(h.containsKey(nums2[i])){
                l.add(nums2[i]);
                h.remove(nums2[i]); 
            }
        }
        
        int[] arr = new int[l.size()];
        for(int i = 0; i<l.size(); i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}