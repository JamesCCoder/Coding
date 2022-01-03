class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows > n || numRows == 1) return s;
        
        List<StringBuilder> rows = new ArrayList<>();
        
        for(int i = 0; i<numRows; i++){
            rows.add(new StringBuilder());
        }
        
        int curRow = 0;
        boolean canGoDown = false;
        for(char c : s.toCharArray()){
            if(curRow == 0 || curRow == numRows - 1){
                canGoDown = !canGoDown;
            }
            
            rows.get(curRow).append(c);
            
            curRow += canGoDown ? 1 : -1;
        }
        
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: rows){
            res.append(sb);
        }
        
        return res.toString();
    }
}