class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        if (s == null || s.length() == 0) {
            return res.toString();
        }
        // A map of each char and its frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // An array of lists of chars, at the index (frequency)
        List<Character> [] bucket = new List[s.length() + 1]; 
        // An short way to iterate map
        for (char key : map.keySet()) {
            // build a frequency list of each char
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<Character>();
            }
            bucket[freq].add(key);
        }
        // Iterate the frequency list from the end to start (index high to low)
        // build the result string
        for (int i = bucket.length-1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    // append 'frequnecy' times
                    for (int j = 0; j < i; j++) {
                        res.append(c);    
                    }
                }     
            }
        }
        return res.toString();
        
    }
}