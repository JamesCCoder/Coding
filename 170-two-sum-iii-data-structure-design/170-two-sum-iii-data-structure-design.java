class TwoSum {

    private HashMap<Integer, Integer> map = new HashMap<>();
    
    public TwoSum() {
        
    }
    
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }
    
    public boolean find(int value) {
        for (int i : map.keySet()) {
            int target = value - i;
            if (map.containsKey(target)) {
                if (i == target && map.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */