class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (String s : split) {
            if (s.equals("") || s.equals(".")) continue;
            if (s.equals("..") || s.equals(".")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }else{
                    continue;
                }
            } else {
                stack.push(s);
            }
        }
        StringBuilder res = new StringBuilder();
        for (String s : stack) {
            res.append("/");
            res.append(s);
        }
        if (res.length() == 0) return "/";
        return res.toString();
    }
}
