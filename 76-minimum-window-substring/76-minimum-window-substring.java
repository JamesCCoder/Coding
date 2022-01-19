class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tfreq = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            tfreq.put(t.charAt(i), tfreq.getOrDefault(t.charAt(i), 0 ) + 1);
        }
        
        HashMap<Character, Integer> window = new HashMap<>();
        int sum = 0;
        
        int start = 0;
        int len = Integer.MAX_VALUE;
        
        int left = 0;
        int right = 0;
        
        while(right < s.length()){
            char c = s.charAt(right);
            if(tfreq.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(tfreq.get(c).equals(window.get(c))){
                    sum++;
                }
            }
            right++;
            
            while(sum == tfreq.size()){
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
                
                char x = s.charAt(left);
                if(tfreq.containsKey(x)){
                    if(window.get(x).equals(tfreq.get(x))){
                        sum--;
                    }
                    window.put(x, window.get(x) - 1);
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}