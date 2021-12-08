var isSymmetric = (root) => {
    
    return check(root.left, root.right);
    
    
};

var check = (n1, n2) =>{
    if(n1 == null || n2 == null){return n1 == n2;}
    return n1.val == n2.val && check(n1.left, n2.right) && check(n1.right, n2.left);
}
