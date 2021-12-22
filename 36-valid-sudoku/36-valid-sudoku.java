class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        
        HashSet<Character>[] row = new HashSet[N];
        HashSet<Character>[] col = new HashSet[N];
        HashSet<Character>[] table = new HashSet[N];
        
        for(int i = 0; i<N; i++){
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            table[i] = new HashSet<Character>();
        }
        
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                char val = board[i][j];
                
                if(val == '.'){
                    continue;
                }
                
                if(row[i].contains(val)){
                    return false;
                }
                
                row[i].add(val);
                
                if(col[j].contains(val)){
                    return false;
                }
                
                col[j].add(val);
                
                int index = (i/3)*3 + j/3;
                if(table[index].contains(val)){
                    return false;
                }
                table[index].add(val);
            }
        }
        return true;
    }
}