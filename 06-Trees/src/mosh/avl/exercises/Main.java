package mosh.avl.exercises;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.isBalanced());
        System.out.println("***size***");
        System.out.println(tree.size());
        System.out.println("***isPerfect***");
        System.out.println(tree.isPerfect());
    }
}
