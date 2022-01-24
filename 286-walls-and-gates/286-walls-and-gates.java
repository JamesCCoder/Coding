class Solution {
    public void wallsAndGates(int[][] rooms) {
    for (int i = 0; i < rooms.length; i++)
        for (int j = 0; j < rooms[0].length; j++)
            if (rooms[i][j] == 0) dfs(rooms, i, j, 0);
}
    private void dfs(int[][] rooms, int i, int j, int d) {
        if (i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < d) return;
        
    
        rooms[i][j] = d;

        if(i < rooms.length - 1 && d+1 < rooms[i+1][j])
            dfs(rooms, i + 1, j, d + 1);
        if(i > 0 && d+1 < rooms[i-1][j])
            dfs(rooms, i - 1, j, d + 1);
        if(j < rooms[i].length-1 && d+1 < rooms[i][j+1])
            dfs(rooms, i, j + 1, d + 1);
        if(j > 0 && d+1 < rooms[i][j-1])
            dfs(rooms, i, j - 1, d + 1);
    } 
}