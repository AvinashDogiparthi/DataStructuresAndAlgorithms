package J_Tree.Problems;

import com.sun.source.tree.Tree;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(){

    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int value){
        this.val = value;
        this.left = null;
        this.right = null;
    }
}
