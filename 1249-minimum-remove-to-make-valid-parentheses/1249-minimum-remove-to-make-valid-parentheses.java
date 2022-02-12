class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                count++;
                sb.append(c);
            } else if (c == ')'){
                if (count > 0){
                    count--;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
         for (int i = sb.length() - 1; i >= 0 && count > 0; i--) {
            if (sb.charAt(i) == '('){
                sb.deleteCharAt(i);
                count--;
            }
        }
        return sb.toString();
    }
}

