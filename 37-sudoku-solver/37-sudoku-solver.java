class Solution {
    public void solveSudoku(char[][] board) {
      if (board == null || board.length != 9 || board[0].length != 9) {
            return;
        }
        Set<Character>[] rowSet = (Set<Character>[])new HashSet[9];
        Set<Character>[] columnSet = (Set<Character>[])new HashSet[9];
        Set<Character>[] boxSet = (Set<Character>[])new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            columnSet[i] = new HashSet<>();
            boxSet[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    rowSet[i].add(c);
                    columnSet[j].add(c);
                    boxSet[boxIndex(i, j)].add(c);
                }
            }
        }
        
        solve(board, rowSet, columnSet, boxSet, 0);
    }
    
    private int boxIndex(int i, int j) {
        return (i / 3) * 3 + j / 3;
    }
    
    private boolean solve(char[][] board, Set<Character>[] rowSet, Set<Character>[] columnSet, Set<Character>[] boxSet, int r) {
        if (r == 8 && checkValid(rowSet, columnSet, boxSet)) {
            return true;
        }
        for (int i = r; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                int bi = boxIndex(i, j);
                if (c == '.') {
                    for (char s = '1'; s <= '9'; s++) {
                        if (!rowSet[i].contains(s) && !columnSet[j].contains(s)
                           && !boxSet[bi].contains(s)) {
                            rowSet[i].add(s);
                            columnSet[j].add(s);
                            boxSet[bi].add(s);
                            board[i][j] = s;
                            if (solve(board, rowSet, columnSet, boxSet, i)) {
                                return true;
                            }
                            board[i][j] = '.';
                            rowSet[i].remove(s);
                            columnSet[j].remove(s);
                            boxSet[bi].remove(s);
                        }
                    }
                    if (board[i][j] == '.') {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean checkValid(Set<Character>[] rowSet, Set<Character>[] columnSet, Set<Character>[] boxSet) {
        for (int i = 0; i < 9; i++) {
            if (rowSet[i].size() != 9 || columnSet[i].size() != 9 || boxSet[i].size() != 9) {
                return false;
            }
        }
        return true;
    }
    
}