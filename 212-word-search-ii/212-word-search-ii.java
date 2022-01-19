class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                for(String word: words){
                    if(helper(board, i, j, word, 0)){
                    set.add(word);
                }
                }
               
            }
        }
        ArrayList<String> res = new ArrayList<>(set);
        return res;
    }
    
    public boolean helper(char[][] board, int i, int j, String word, int index){
        if(index == word.length()) return true;
        if(i<0 || j<0 || i >=board.length || j>= board[0].length || word.charAt(index) != board[i][j]) return false;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = helper(board, i, j-1, word, index+1)
            || helper(board, i, j+1, word, index+1)
            || helper(board, i+1, j, word, index+1)
            || helper(board, i-1, j, word, index+1);
        board[i][j] = temp;
        return found;
    }
}