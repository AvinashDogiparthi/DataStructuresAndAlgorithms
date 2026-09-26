package J_Tree.Problems.BFS.AR_BottomViewOfABinaryTree_GFG;

import java.util.*;

class Solution {
    public ArrayList<Integer> bottomView(Node root) {

        if(root == null){
            return new ArrayList<>();
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));

        Map<Integer, Node> mapOfLine = new TreeMap<>();
        ArrayList<Integer> bottomview = new ArrayList<>();

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                Pair currentPair = queue.poll();
                int currentLine = currentPair.getLine();
                Node currentNode = currentPair.getNode();

                mapOfLine.put(currentLine,currentNode);

                if(currentNode.left != null){
                    queue.offer(new Pair(currentLine-1, currentNode.left));
                }

                if(currentNode.right != null){
                    queue.offer(new Pair(currentLine+1, currentNode.right));
                }
            }
        }

        for(int i : mapOfLine.keySet()){
            Node currentNode = mapOfLine.get(i);
            bottomview.add(currentNode.data);
        }

        return bottomview;

    }
}


class Pair{

    int lineNumber;
    Node node;

    Pair(){

    }

    Pair(int lineNumber, Node node){
        this.lineNumber = lineNumber;
        this.node = node;
    }


    public int getLine(){
        return this.lineNumber;
    }

    public Node getNode(){
        return this.node;
    }
}