class Solution {
    
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        helper(s, new StringBuffer(), 3, 0);
        return res;
    }
    
    public void helper(String s, StringBuffer cur, int dotLeft, int index){
        if(dotLeft == 0){
            if(valid(s.substring(index))){
                cur.append("."+ s.substring(index));
                res.add(cur.toString());
            }
            return;
        }
        for(int right = index; right<s.length(); right++){
            if(valid(s.substring(index, right + 1))){
                int length = cur.length();
                if(dotLeft == 3){
                    cur.append(s.substring(index, right + 1));
                    helper(s, cur, dotLeft-1, right +1);
                    cur.setLength(length);
                }else{
                    cur.append("." + s.substring(index, right + 1));
                    helper(s, cur, dotLeft-1, right +1);
                    cur.setLength(length);
                }
            }
        }
    }
    
    public boolean valid(String s){
        if(s.length()>3) return false;
        if(s.length()<1) return false;
        if(s.charAt(0) == '0' && s.length()>1) return false;
        if(Integer.valueOf(s)>255) return false;
        return true;
    }
    
    
}