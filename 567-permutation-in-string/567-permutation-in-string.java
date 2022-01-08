class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        
        int[] count1 = new int[128];
        int[] count2 = new int[128];
        for (int i = 0; i < len1; i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        if (Arrays.equals(count1, count2)) return true;
        
        for (int i = len1; i < len2; i++) {
            count2[s2.charAt(i)]++;
            count2[s2.charAt(i - len1)]--;
            if (Arrays.equals(count1, count2)) return true;
        }
        
        return false;
    }
}
