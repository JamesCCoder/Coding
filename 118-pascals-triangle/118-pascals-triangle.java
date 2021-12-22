class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> seed = new ArrayList<>();
        seed.add(1);
        res.add(seed);
        
        if(numRows == 1){
            return res;
        }
        
        for(int i = 1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<i; j++){
                if(j == 0){
                    row.add(1);
                }else{
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
        }
            row.add(1);
            res.add(row);
    }
        return res;
}
}