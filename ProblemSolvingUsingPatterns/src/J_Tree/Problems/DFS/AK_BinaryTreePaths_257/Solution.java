package J_Tree.Problems.DFS.AK_BinaryTreePaths_257;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> listOfStrings = new ArrayList<>();

        if(root == null){
            return listOfStrings;
        }

        getAllPaths(root,"",listOfStrings);
        return listOfStrings;
    }

    public void getAllPaths(TreeNode node,String path, List<String> listOfPaths){
        if(node.left == null && node.right == null){
            listOfPaths.add(path+node.val);
            return;
        }

        if(node.left != null){
            getAllPaths(node.left,path+node.val+"->",listOfPaths);
        }

        if(node.right != null){
            getAllPaths(node.right,path+node.val+"->", listOfPaths);
        }
    }
}