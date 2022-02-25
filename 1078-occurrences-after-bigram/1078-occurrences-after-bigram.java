class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] s = text.split(" ");
        for(int i = 0; i<s.length-2; i++){
            if(s[i].equals(first) && s[i+1].equals(second)){
                list.add(s[i+2]);
            }
        }
        String[] res = list.toArray(new String[0]);
        return res;
    }
}