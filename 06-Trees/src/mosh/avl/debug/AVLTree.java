package mosh.avl.debug;

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

    public void insertDebug() {
        root = new AVLNode(1);
        root.leftChild = new AVLNode(2);
        root.leftChild.leftChild = new AVLNode(4);
        root.leftChild.rightChild = new AVLNode(5);
        root.rightChild = new AVLNode(3);
        root.rightChild.rightChild = new AVLNode(6);
        root.rightChild.rightChild.leftChild = new AVLNode(7);
    }

    public int heightDebug() {
        return heightDebug(root);
    }

    private int heightDebug(AVLNode root) {
        if(root == null)
            return -1;
        var leftHeight = heightDebug(root.leftChild);
        var rightHeight = heightDebug(root.rightChild);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
}
