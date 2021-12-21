class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int sum = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int j = 0; j<s.length(); j++){
            for(int i = 0; i<=j; i++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<=2 || dp[i+1][j-1]);
                if(dp[i][j]){
                    if(j-i+1 > sum){
                        sum = j-i+1;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }
        return res;
    }
}