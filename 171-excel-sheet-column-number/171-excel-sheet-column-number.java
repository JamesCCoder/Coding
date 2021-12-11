class Solution {
    public int titleToNumber(String columnTitle) {

        int res = 0;
        for(int i = 0; i<columnTitle.length(); i++){
            char C = columnTitle.charAt(i);
            res = res * 26 + C - 'A'+1;
        }
        return res;
    }
}


