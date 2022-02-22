class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber != 0){
            char c = (char)((columnNumber-1) % 26 + 65);
            res = c + res;
            columnNumber = (columnNumber-1) / 26;
        }
        return res;
    }
}