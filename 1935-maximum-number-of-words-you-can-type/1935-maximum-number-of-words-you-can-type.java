class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int res = str.length;
        for(String str1: str){
            for(int i = 0;i<brokenLetters.length(); i++){
                if(str1.contains(""+brokenLetters.charAt(i))){
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}