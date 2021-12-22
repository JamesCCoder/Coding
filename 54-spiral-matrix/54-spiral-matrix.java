class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows -1;
        while(res.size()<rows * columns){
            for(int i = left; i<=right; i++){
                res.add(matrix[up][i]);
            }
            
            for(int i = up +1; i<=down; i++){
                res.add(matrix[i][right]);
            }
            
            if(up != down){
                for(int i = right - 1; i>=left; i--){
                    res.add(matrix[down][i]);
                }
            }
            
            if(left != right){
                for(int i = down - 1; i>up; i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
}