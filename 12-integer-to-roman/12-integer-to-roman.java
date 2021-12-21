class Solution {
    public String intToRoman(int num) {
        String res = "";
        String[] str = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Integer[] ins= new Integer[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for(int i = 0; i<str.length; i++){
            while(num >= ins[i]){
                num -= ins[i];
                res += str[i];
            }
        }
        return res;
    }
}