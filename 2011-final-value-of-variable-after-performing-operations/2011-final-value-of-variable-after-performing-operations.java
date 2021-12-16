class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String s: operations){
            if(s.contains("+")){
                result++;
            }else{
                result--;
            }
        }
        
        return result;
    }
}