package mosh.avl.exercises;

public class AVLTree {
    private class AVLNode {
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "AVLNode{" +
                    "value=" + value +
                    '}';
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if(root == null)
            return new AVLNode(value);
        if(value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);
        return root;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(AVLNode node) {
        if(node == null)
            return true;
        var leftHeight = height(node.leftChild);
        var rightHeight = height(node.rightChild);
        return !(leftHeight - rightHeight > 1) && !(rightHeight - leftHeight > 1) && isBalanced(node.rightChild) && isBalanced(node.rightChild);
    }

    public boolean isPerfect() {
        return Math.pow(2, height(root)+1) - 1 == size(root);
    }

    public int size() {
        return size(root);
    }

    private int size(AVLNode root) {
        if(root == null)
            return 0;
        return 1 + size(root.leftChild) + size(root.rightChild);
    }

    private int height(AVLNode node) {
        if(node == null)
            return -1;
        return Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }
}
