package J_Tree.Problems.BFS.AR_BottomViewOfABinaryTree_GFG;

import java.util.*;

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        
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
        
        Map<Integer,List<Node>> map = new TreeMap<>();
        List<Node> listNode = new ArrayList<>();
        listNode.add(root);
        map.put(0,listNode);
        
        
        while(!queue.isEmpty()){
            
            int levelSize = queue.size();
            
            for(int i  = 0;i<levelSize;i++){
                
                Pair currentPair = queue.poll();
                Node currentNode = currentPair.getNode();
                int line = currentPair.getLine();
                
                if(!map.containsKey(line)){
                    List<Node> trackingList = new ArrayList<>();
                    trackingList.add(currentNode);
                    map.put(line,trackingList);
                } else {
                    map.get(line).add(currentNode);
                }
                
                
                if(currentNode.left != null){
                    queue.offer(new Pair(currentNode.left,line-1));
                }
                
                if(currentNode.right != null){
                    queue.offer(new Pair(currentNode.right,line+1));
                }
            }
        }
        
        for(int key : map.keySet()){
            List<Node> listOfNodes = map.get(key);
            list.add(listOfNodes.get(listOfNodes.size()-1).data);
        }
    }
    
    static class Pair{
        Node node;
        int lineNumber;
        
        Pair(Node node, int lineNumber){
            this.node = node;
            this.lineNumber = lineNumber;
        }
        
        Node getNode(){
            return this.node;
        }
        
        int getLine(){
            return this.lineNumber;
        }
    }
}