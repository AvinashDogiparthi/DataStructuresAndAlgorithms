package J_Tree.Problems.DFS.AF_SerializeAndDeserializeBinaryTree_297;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list);

        String result = "";

        for(String str : list){
            result = result + str +",";
        }

        return result;
    }

    public void helper(TreeNode node, List<String> list){

        if(node == null){
            list.add("n");
            return;
        }

        list.add(Integer.toString(node.val));
        helper(node.left,list);
        helper(node.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String[] list = data.split(",");
        List<String> list1 = new ArrayList<>(Arrays.asList(list));
        Collections.reverse(list1);
        return getBinaryTree(list1);

    }

    public TreeNode getBinaryTree(List<String> list){

        String val = list.remove(list.size()-1);

        if(val.charAt(0) == 'n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = getBinaryTree(list);
        node.right = getBinaryTree(list);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));