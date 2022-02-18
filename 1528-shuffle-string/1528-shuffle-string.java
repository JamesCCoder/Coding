class Solution {
    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}

