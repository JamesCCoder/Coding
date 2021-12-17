class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> res= new HashMap<>();
        int sum = 0;
        for(int i = 0; i<sentence.length(); i++){
            if(!res.containsKey(sentence.charAt(i))){
                res.put(sentence.charAt(i), 1);
                sum ++;
            }else{
                res.put(sentence.charAt(i), res.get(sentence.charAt(i))+1);
            }
            
        }
        if(sum == 26){
            return true;
        }else{
            return false;
        }
        
    }
}