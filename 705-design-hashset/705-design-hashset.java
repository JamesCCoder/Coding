class MyHashSet {

    public MyHashSet() {
        
    }
    
    boolean[] nodes = new boolean[1000009];
    
    public void add(int key) {
        nodes[key] = true;
    }
    
    public void remove(int key) {
        nodes[key] = false;
    }
    
    public boolean contains(int key) {
        return nodes[key];
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */