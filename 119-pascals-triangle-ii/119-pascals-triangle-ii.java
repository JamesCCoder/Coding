class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
     
        
        for(int i = 1; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j = 0; j<i; j++){
                if(j == 0){
                    row.add(1);
                }else{
                    row.add(res.get(j-1) + res.get(j));
                }
            }
            row.add(1);
            res = row;
        }
        return res;
    }
}