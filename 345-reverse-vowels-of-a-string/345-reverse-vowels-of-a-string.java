class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        
        String vowel = "aeiouAEIOU";
        
        while(start < end){
            while(start < end && !vowel.contains(chars[start]+"")){
                start++;
            }
            while(start < end && !vowel.contains(chars[end]+"")){
                end--;
            }
            
            char tmp = chars[start];
            chars[start]= chars[end];
            chars[end] = tmp;
            
            start++;
            end--;
        }
        return new String(chars);
    }
}
