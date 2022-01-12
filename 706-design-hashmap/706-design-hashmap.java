class MyHashMap {

     int[] bucket = new int[1000001];

    public MyHashMap() {
        Arrays.fill(bucket, -1);
    }
    
    public void put(int key, int value) {
        bucket[key] = value;
    }
    
    public int get(int key) {
        if (bucket[key] != -1)
            return bucket[key];
        else
            return -1;
    }
    
    public void remove(int key) {
        bucket[key]=-1;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
