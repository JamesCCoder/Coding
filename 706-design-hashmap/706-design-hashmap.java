class MyHashMap {

    int INF = Integer.MAX_VALUE;
    int N = 1000009;
    int[] map = new int[N];
    public MyHashMap() {
        Arrays.fill(map, INF);
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key] == INF ? -1 : map[key];
    }
    
    public void remove(int key) {
        map[key] = INF;

}
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */