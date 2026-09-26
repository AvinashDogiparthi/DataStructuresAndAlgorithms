package J_Tree.Problems.BFS.AV_FindBottomLeftTreeValue;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        
        if(root == null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<Integer> listOfValues = new ArrayList<>();

        while(!queue.isEmpty()){

            listOfValues.clear();
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                TreeNode currentNode = queue.poll();
                listOfValues.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }

        return listOfValues.get(0);
    }
}