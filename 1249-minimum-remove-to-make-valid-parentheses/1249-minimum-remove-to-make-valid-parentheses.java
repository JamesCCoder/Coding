class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                sum++;
                sb.append(c);
            }else if(c == ')'){
                if(sum > 0){
                    sum--;
                    sb.append(c);
                }
            }else{
                sb.append(c);
            }
        }
        
        for(int i = sb.length()-1; i>=0 && sum > 0; i--){
            if(sb.charAt(i) == '('){
                sb.deleteCharAt(i);
                sum--;
            }
        }
        return sb.toString();
    }
}