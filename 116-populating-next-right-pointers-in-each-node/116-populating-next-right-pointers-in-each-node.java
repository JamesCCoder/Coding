/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      if(root == null) return  null;
        
        if(root.left != null) { // check for left first
            if(root.right != null) // if right of root is also present, then just assign this to left.next
                root.left.next = root.right;
            else 
                root.left.next = findNext(root); // we need to find out which node in root.next comes next
        }
        
        if(root.right != null) {
            root.right.next = findNext(root); // for any right node of a root, we need to use the root's next to find the next
        }
        
        connect(root.right); // call from root.right first because of the way we use findNext(). We need to have answers in right first to find for left
        connect(root.left);
        
        return root;
    }
    
    private Node findNext(Node node) {
        while(node.next != null) { // do until we get the next 
            node = node.next;
            if(node.left != null) return node.left;
            if(node.right != null) return node.right;
        }
        return null;
    }
}

