class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";
        for(int i = 0; i<words.length; i++){
            if(isPalin(words[i]) == true){
                res = words[i];
                break;
            }
        }
        return res;
    }
    
    public boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}