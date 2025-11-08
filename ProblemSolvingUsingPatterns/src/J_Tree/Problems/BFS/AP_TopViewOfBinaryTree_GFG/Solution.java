package J_Tree.Problems.BFS.AP_TopViewOfBinaryTree_GFG;


import java.util.*;

class Solution {
    public ArrayList<Integer> topView(Node root) {
        
        List<Integer> list = new ArrayList<>();
        
        if(root == null){
            return new ArrayList<>(list);
        }
        
        
        bfsTraversal(root,list);
        return new ArrayList<>(list);
    }
    
    public void bfsTraversal(Node root, List<Integer> list){
        
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        
        Map<Integer,Node> map = new TreeMap<>();
        map.put(0,root);
        
        while(!queue.isEmpty()){
            
            int levelSize = queue.size();
            
            for(int i = 0;i<levelSize;i++){
                
                Pair currentPair = queue.poll();
                Node currentNode = currentPair.getNode();
                int currentLine = currentPair.getLine();
                
                if(!map.containsKey(currentLine)){
                    map.put(currentLine,currentNode);
                }
                
                if(currentNode.left != null){
                    queue.offer(new Pair(currentNode.left,currentLine-1));
                }
                
                if(currentNode.right != null){
                    queue.offer(new Pair(currentNode.right, currentLine+1));
                }
            }
        }
        
        for(int key : map.keySet()){
            Node node = map.get(key);
            list.add(node.data);
        }
    }
    
    static class Pair{
        Node node;
        int linenumber;
        
        Pair(Node node, int lineNumber){
            this.node = node;
            this.linenumber = lineNumber;
        }
        
        Node getNode(){
            return this.node;
        }
        
        int getLine(){
            return this.linenumber;
        }
    }
}