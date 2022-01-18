class Solution {
    public String largestNumber(int[] nums) {
    String[] arr = new String[nums.length];

    for(int i=0;i<nums.length;i++){
        arr[i]=String.valueOf(nums[i]);
    }
  
    Arrays.sort(arr, (s1,s2)-> (s2+s1).compareTo(s1+s2));

    if("0".equals(arr[0])) return "0";

    StringBuilder sb = new StringBuilder();
    for(String s : arr) sb.append(s);
    return sb.toString();
    }
}