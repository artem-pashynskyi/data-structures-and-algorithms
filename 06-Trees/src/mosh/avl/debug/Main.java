package mosh.avl.debug;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insertDebug();
        System.out.println(tree.heightDebug());
    }
}
