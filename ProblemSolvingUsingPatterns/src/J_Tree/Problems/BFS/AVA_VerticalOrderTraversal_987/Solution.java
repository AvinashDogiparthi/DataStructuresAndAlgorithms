package J_Tree.Problems.BFS.AVA_VerticalOrderTraversal_987;

import J_Tree.Problems.TreeNode;

import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }


        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0,root));

        Map<Integer,List<Integer>> mapOfLineValues = new TreeMap<>();

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                Pair currentPair = queue.poll();
                int currentLine = currentPair.getLine();
                TreeNode currentNode = currentPair.getNode();

                if(mapOfLineValues.containsKey(currentLine)){
                     mapOfLineValues.get(currentLine).add(currentNode.val);
                } else {
                    List<Integer> lineValues = new ArrayList<>();
                    lineValues.add(currentNode.val);
                    mapOfLineValues.put(currentLine,lineValues);
                }

                if(currentNode.left != null){
                    queue.offer(new Pair(currentLine-1,currentNode.left));
                }

                if(currentNode.right != null){
                    queue.offer(new Pair(currentLine+1, currentNode.right));
                }
            }
        }

        List<List<Integer>> levelByLevel = new ArrayList<>();

        for(int i : mapOfLineValues.keySet()){
            List<Integer> listOfValues = mapOfLineValues.get(i);
            Collections.sort(listOfValues);
            levelByLevel.add(listOfValues);
        }

        return levelByLevel;
        
    }
}

class Pair{

    int line;
    TreeNode node;

    Pair(){

    }

    Pair(int lineNumber, TreeNode node){
        this.line = lineNumber;
        this.node = node;
    }

    public int getLine(){
        return this.line;
    }

    public TreeNode getNode(){
        return this.node;
    }
}