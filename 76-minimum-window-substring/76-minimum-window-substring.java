class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0 ) + 1);
        }
        
        HashMap<Character, Integer> window = new HashMap<>();
        int start = 0;
        int len = Integer.MAX_VALUE;
        
        int left = 0;
        int right = 0;
        
        int sum = 0;
        
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
                if(map.get(s.charAt(right)).equals(window.get(s.charAt(right)))){
                    sum++;
                }
            }
            right++;
            
            while(sum == map.size()){
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
            
            
            
            if(map.containsKey(s.charAt(left))){
                if(window.get(s.charAt(left)).equals(map.get(s.charAt(left)))){
                    
                    sum--;
                }
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);//window.put(s.charAt(left), window.getOrDefault(s.charAt(left), 0) - 1);
            }
            left++;
            }   
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}