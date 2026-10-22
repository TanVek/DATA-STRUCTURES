public class BST<Key extends Comparable> {
    private Node root;
    private class Node {
        Key key; // this node's data
        Node left, right; // this node's children

        // Constructor: initializes data and makes this a leaf node
        public Node(Key key) { this(key, null, null); }
        
        // Constructor: initializes node data and sets its subtrees
        public Node(Key key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }
    // Constructor: initializes an empty binary search tree
    public BST() { }

    // inserts a new node in the binary search tree (BST)
    public void add (Key key ) { root = add(root, key); }

    // recursively adds a new node preserving the BST property
    private Node add (Node node, Key key) {
        if (node == null) return new Node(key);
        int cmp = key.compareTo(node.key);
        if (cmp <= 0) node.left = add(node.left, key);
        else node.right = add(node.right, key);
        return node;
    }
    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // perform preorder traversal recursively
    private void preorderHelper( Node node ) {
        // YOUR CODE BELOW
        if ( node == null ) return; // stopping condition?
        //output node data
        System.out.print(node.key + " ");
        // traverse left subtree
        preorderHelper(node.left);
        // traverse right subtree
        preorderHelper(node.right);
    }
    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // perform inorder traversal recursively
    private void inorderHelper( Node node ) {
        // YOUR CODE BELOW
        if ( node == null ) return; // stopping condition?
         // traverse left subtree
        inorderHelper(node.left);
        //output node data
        System.out.print(node.key + " ");
        // traverse right subtree
        inorderHelper(node.right);
    }
    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // perform postorder traversal recursively
    private void postorderHelper( Node node ) {
        // YOUR CODE BELOW
        if ( node == null ) return; // stopping condition?
        // traverse left subtree
        postorderHelper(node.left);
        // traverse right subtree
        postorderHelper(node.right);
        // output node data
        System.out.print(node.key + " ");
    }
    public Key contains(Node node, Key key) {
        if(node == null) return null; 
        contains(node.left, key);
        contains(node.right, key);
        if(node.key == key) return node.key;
        else{
            postorderHelper(root);
            return null;
        }
    }
    // BST client: outputs a sequence of integers in sorted order:
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Integer[] keys = {21, 68, 11, 13, 17, 97};
        System.out.println("Building a BST from the following keys:");
        for (Integer key : keys) {
            System.out.printf("%d ", key);
            bst.add(key);
        }
        System.out.printf("%n%nIn-Order Tree Traversal:%n");
        bst.inorderTraversal(); // prints 11 13 17 21 68 97
        //System.out.printf("%n%nKeys in sorted order:%n")
    }
}