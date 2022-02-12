class Solution {
    /**
     * 两次遍历
     *  第一次遍历: 去除多余的右括号
     *  第二次遍历: 去除多余的左括号
     */
    public String minRemoveToMakeValid(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        //去除多余的右括号
        int leftCount = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '('){
                leftCount++;
                sb.append(c);
            } else if (c == ')'){
                if (leftCount > 0){
                    leftCount--;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        //去除多余的左括号(从前往后删除也行)
        for (int i = sb.length() - 1; i >= 0 && leftCount > 0; i--) {
            if (sb.charAt(i) == '('){
                sb.deleteCharAt(i);
                leftCount--;
            }
        }
        return sb.toString();
    }
}

