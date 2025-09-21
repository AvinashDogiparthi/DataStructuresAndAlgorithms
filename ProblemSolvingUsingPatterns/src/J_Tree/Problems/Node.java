package J_Tree.Problems;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    // Default constructor
    public Node() {}

    // Constructor with value
    public Node(int _val) {
        val = _val;
    }

    // Constructor with value, left, right, and next pointers
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
