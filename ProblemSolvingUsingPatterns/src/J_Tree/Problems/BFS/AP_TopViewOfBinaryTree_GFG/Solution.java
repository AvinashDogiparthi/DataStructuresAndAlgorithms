package J_Tree.Problems.BFS.AP_TopViewOfBinaryTree_GFG;


import java.util.*;

class Solution {
    public ArrayList<Integer> topView(Node root) {

        if(root == null){
            return new ArrayList<>();
        }

        Queue<Pair> queue = new LinkedList<>();
        Pair rootPair = new Pair(root,0);

        queue.offer(rootPair);

        Map<Integer,Node> lineAndValue = new TreeMap<>();

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                Pair currentPair = queue.poll();
                Node currentNode = currentPair.getNode();
                int lineNumber = currentPair.getLineNumber();

                if(!lineAndValue.containsKey(currentPair.getLineNumber())){
                    lineAndValue.put(lineNumber,currentNode);
                }

                if(currentNode.left != null){
                    queue.offer(new Pair(currentNode.left, lineNumber-1));
                }

                if(currentNode.right != null){
                    queue.offer(new Pair(currentNode.right, lineNumber+1));
                }
            }
        }

        ArrayList<Integer> topViewElements = new ArrayList<>();

        for(int i : lineAndValue.keySet()){
            Node currentNode = lineAndValue.get(i);
            topViewElements.add(currentNode.data);
        }

        return topViewElements;

    }
}

class Pair{
    Node node;
    int lineNumber;

    Pair(){

    }

    Pair(Node node, int linenumber){
        this.node = node;
        this.lineNumber = linenumber;
    }

    public int getLineNumber(){
        return this.lineNumber;
    }

    public Node getNode(){
        return this.node;
    }
}