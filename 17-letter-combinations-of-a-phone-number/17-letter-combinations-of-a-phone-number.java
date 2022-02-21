class Solution {
    
    String[] board = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return res;
        helper(digits, new StringBuilder(), 0);
        return res;
    }
    
    public void helper(String digits, StringBuilder cur, int index){
        if(index == digits.length()){
            res.add(cur.toString());
            return;
        }
        String letter = board[digits.charAt(index) - '0'];
        for(int i = 0; i<letter.length(); i++){
            char c = letter.charAt(i);
            cur.append(c);
            helper(digits, cur, index + 1);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}