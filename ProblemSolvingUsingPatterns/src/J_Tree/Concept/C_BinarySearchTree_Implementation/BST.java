package J_Tree.Concept.C_BinarySearchTree_Implementation;

public class BST {

    public class Node{
        int value ;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getvalue(){
            return this.value;
        }
    }

    private Node root;
    public BST() {

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getvalue());
        display(node.left,"Left Child of "+node.getvalue()+" : ");
        display(node.right,"Right child of "+node.getvalue()+" : ");
    }

    public void insert(int value){
        root = insert(value,root);

    }

    public Node insert(int value, Node node){
        if(node == null){
            Node returnableNode = new Node(value);
            return returnableNode;
        }

        if(value<node.value){
            node.left = insert(value,node.left);
        }

        if(value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){

        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums){
        for(int i : nums){
            this.insert(i);
        }
    }
}
