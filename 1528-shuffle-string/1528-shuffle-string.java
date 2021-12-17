class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder r = new StringBuilder(s);
        for(int i =0; i<indices.length; i++){
            r.setCharAt(indices[i], s.charAt(i));
        }
        return r.toString();
    }
}


