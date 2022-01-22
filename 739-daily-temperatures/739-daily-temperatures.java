class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        
        for(int i = 0; i< temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int pre = stack.pop();
                res[pre] = i - pre;
            }
            stack.add(i);
        }
        return res;
    }
}