class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toLowerCase().equals(word)) return true;
        if(word.toUpperCase().equals(word)) return true;
        int n = word.length();
        int sum = 1;
        if(Character.isUpperCase(word.charAt(0))){
            while(sum < n && Character.isLowerCase(word.charAt(sum))){
                sum++;
            }
        }
        return sum == n;
    }
}