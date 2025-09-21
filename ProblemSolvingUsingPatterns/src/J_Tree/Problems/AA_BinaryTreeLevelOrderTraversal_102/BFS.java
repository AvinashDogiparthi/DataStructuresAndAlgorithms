package J_Tree.Problems.AA_BinaryTreeLevelOrderTraversal_102;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> currentLevelList = new ArrayList<>();

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();
                currentLevelList.add(node.val);

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }


            result.add(currentLevelList);
        }

        return result;
    }
}
