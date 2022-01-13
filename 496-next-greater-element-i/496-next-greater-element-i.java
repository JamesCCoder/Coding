class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.add(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        
        int[] res = new int[nums1.length];
        
        for(int i = 0; i< nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
        
    }
}