class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int[] res = new int[2]; 
        while(s<e){
            int sum = numbers[s] + numbers[e]; 
            if(target == sum){
                return new int[]{s+1, e+1};
            }
            if(target > sum){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1, -1};
    }
}