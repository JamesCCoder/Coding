class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() < numRows) return s;
        List<StringBuilder> list = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            list.add(new StringBuilder());
        }
        
        int curRow = 0;
        boolean canChange = false;
        
        for(int i = 0; i<s.length(); i++){
            if(curRow == 0 || curRow == numRows - 1){
                canChange = !canChange;
            }
            list.get(curRow).append(s.charAt(i));
            curRow += canChange ? 1 : -1;
        }
        
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: list){
            res.append(sb);
        }
        return res.toString();
    }
}