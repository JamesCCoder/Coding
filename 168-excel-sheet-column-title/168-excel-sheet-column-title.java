class Solution {
    public String convertToTitle(int col) {
        String res = "";
        while(col != 0){
            char c = (char)((col-1) % 26 + 65);
            res = c + res;
            col = (col-1) / 26;
        }
        return res;
    }
}