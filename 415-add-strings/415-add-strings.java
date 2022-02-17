class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int n1 = num1.length() -1;
        int n2 = num2.length() -1;
        int sum = 0;
        int carry = 0;
        
        while(n1 >= 0 || n2 >= 0){
            int x1 = n1 >= 0 ? num1.charAt(n1) - '0' : 0;
            int x2 = n2 >= 0 ? num2.charAt(n2) - '0' : 0;
            sum = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            res.append(sum);
            n1--;
            n2--;
        }
        if(carry == 1){
            res.append(1);
        }
        return res.reverse().toString();
    }
}