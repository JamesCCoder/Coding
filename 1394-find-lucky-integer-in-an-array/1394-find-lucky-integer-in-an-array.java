class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!res.containsKey(arr[i])){
                res.put(arr[i], 1);
            }else{
                res.put(arr[i], res.get(arr[i])+1);
            }
        }
        
        int s= Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==res.get(arr[i])){
                lucky = arr[i];
                if(lucky>s){
                    s = lucky;
                }
            }
        }
        if(s<0){
            s = -1;
        }
        return s;
    }
}