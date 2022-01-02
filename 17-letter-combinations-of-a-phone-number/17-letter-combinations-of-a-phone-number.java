class Solution {
    String[] keyboard = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return res;
        helper(digits, new StringBuffer(), 0);
        return res;
        
    }
    
    public void helper(String digits, StringBuffer cur, int index){
        if(index == digits.length()){
            res.add(cur.toString());
            return;
        }
        String letters = keyboard[digits.charAt(index)-'0'];
        for(int i = 0;i<letters.length(); i++){
            char c = letters.charAt(i);
            cur.append(c);
            helper(digits, cur, index + 1);
            cur.deleteCharAt(cur.length()-1);
        }
        
    } 
}