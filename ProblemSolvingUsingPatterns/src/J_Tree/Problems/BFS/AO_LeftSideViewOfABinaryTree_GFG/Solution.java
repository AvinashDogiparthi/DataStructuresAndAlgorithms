package J_Tree.Problems.BFS.AO_LeftSideViewOfABinaryTree_GFG;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        List<Integer> leftSideView = new ArrayList<>();
        
        if(root == null){
            return new ArrayList<>();
        }
        
        bfsTraversal(root,leftSideView);
        return new ArrayList<>(leftSideView);
    }
    
    public void bfsTraversal(Node root, List<Integer> leftSideView){
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            
            int levelSize = queue.size();
            boolean isFirstElement = true;
            
            for(int i = 0;i<levelSize;i++){
                
                Node currentNode = queue.poll();
                
                if(isFirstElement){
                    leftSideView.add(currentNode.data);
                    isFirstElement = false;
                }
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
    }
}