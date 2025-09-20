package J_Tree.Concepts.B_Implementation;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        binaryTree.populate(scanner);
        binaryTree.display();
    }
}
