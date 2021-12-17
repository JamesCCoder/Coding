class Solution {
    public int maxDepth(String s) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                sum++;
            }
            if(sum>res){res=sum;}
            if(s.charAt(i)==')'){
                sum--;
            }
        }
        return res;
    }
}