package J_Tree.Concept.C_BinarySearchTree_Implementation;

public class Demo {

    public static void main(String[] args) {
        int[]  nums = new int[]{5,2,7,1,4,6,9,8,3,10};
        BST bst = new BST();
        bst.populate(nums);
        bst.display();
    }
}
