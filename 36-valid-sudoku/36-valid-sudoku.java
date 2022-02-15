class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] row = new HashSet[N];
        HashSet<Character>[] col = new HashSet[N];
        HashSet<Character>[] table = new HashSet[N];
        
        for(int i = 0; i<N; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            table[i] = new HashSet<>();
        }
        
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                char c = board[i][j];
                if(c =='.') continue;
                
                if(row[i].contains(c)){
                    return false;
                }
                row[i].add(c);
                
                if(col[j].contains(c)){
                    return false;
                }
                col[j].add(c);
                
                int k = (i/3)*3 + j/3;
                if(table[k].contains(c)){
                    return false;
                }
                table[k].add(c);
            }
        }
        return true;
    }
}