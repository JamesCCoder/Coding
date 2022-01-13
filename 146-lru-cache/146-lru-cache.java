class LRUCache {

   //缓存大小
    public int capacity;
    //头结点与尾结点的初始化
    public Node head;
    public Node tail;
    //用于记录缓存中存储的数据
    public HashMap<Integer,Node>map;
    //LRU缓存的构造
    public LRUCache(int capacity) {
        map = new HashMap<>();
		
        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.pre = head;

        this.capacity = capacity;
    }
    
	public int get(int key) {
		//先尝试从缓存map中获取对应key的节点
        Node node = map.get(key);
        //如果不存在就返回-1
        if (node == null){
            return -1;
        }
        //将其移至链尾 代表最近使用过
        moveToTail(node,node.val);
        //如果可以得到节点的话返回节点的val
        return node.val;
    }
    
	public void put(int key, int value) {
		//如果当前map缓存中存在这个key,就直接去map中找到并且将其节点移至链尾 表示最近使用过
        if(map.containsKey(key)){
            Node node = map.get(key);
            moveToTail(node,value);
        }else {
        	//如果当前缓存数据已满 则需要删除最开始的节点数据 清除其在map缓存中的位置
            if (map.size() == this.capacity){
                Node node = head.next;
                delete(node);
                map.remove(node.key);
            }
			//然后创建新的节点数据，并且添加到链尾表示最近访问过的同时将其加入到map缓存中
            Node newNode = new Node(key,value);
            insertTail(newNode);
            map.put(key,newNode);
        }
    }

	public void moveToTail(Node node,int val){
		//先将此节点删去后移至链尾
        delete(node);
        insertTail(node);
        //为其赋值
        node.val = val;
    }

    public void delete(Node node){
        //要删除的节点的pre节点的next节点 为当前节点的next节点
        node.pre.next = node.next;
        //要删除节点的next节点的pre节点 为当前节点的pre节点
        node.next.pre = node.pre;
    }

    public void insertTail(Node node){
        //当前节点的pre指针为尾结点的pre节点
        node.pre = tail.pre;
        //当前节点的next节点为node节点
        node.next = tail;
        //然后更改尾结点的位置，此时尾结点的pre节点的next节点应该指向node
        tail.pre.next = node;
        //尾结点的pre节点就是node节点
        tail.pre = node;
    }
}
class Node{
	//记录key与val的同时记录当前节点的pre节点与next节点 双向链表
    public int key;
    public int val;
    public Node pre;
    public Node next;
    //初始化节点
    public Node(int key ,int val){
        this.key = key;
        this.val = val;
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */