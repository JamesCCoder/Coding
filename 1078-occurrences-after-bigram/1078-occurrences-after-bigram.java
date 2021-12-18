class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] str = text.split(" ");
        for(int i = 0; i<str.length-2; i++){
            if((str[i].equals(first))&&(str[i+1].equals(second))){
                res.add(str[i+2]);
            }
        }
        String[] array = res.toArray(new String[0]);
        return array;
    }
}