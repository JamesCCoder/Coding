class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        int m = image.length;
        int n = image[0].length;
        helper(image, sr, sc, m, n, image[sr][sc], newColor);
        return image;
    }
    
    public void helper(int[][] image, int x, int y, int m, int n, int oldColor, int newColor){
        if(x < 0 || x>=m || y<0 || y>=n) return;
        if(image[x][y] != oldColor) return;
        image[x][y] = newColor;
        helper(image, x+1, y, m, n, oldColor, newColor);
        helper(image, x-1, y, m, n, oldColor, newColor);
        helper(image, x, y+1, m, n, oldColor, newColor);
        helper(image, x, y-1, m, n, oldColor, newColor);
    }
}