package mosh;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if(root == null) {
            root = node;
            return;
        }
        var current = root;
        while (current != null) {
            if(value < current.value) {
                if(current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            if(value > current.value) {
                if(current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if(value < current.value)
                current = current.leftChild;
            else if(value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if(root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if(root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if(root == null)
            return -1;
        if(root.leftChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    //Binary Search Tree - O(log n)
    public int min(){
        if(root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    //Binary Tree - O(n)
    private int min(Node root) {
        if(isLeaf(root))
            return root.value;
        int leftMin = min(root.leftChild);
        int rightMin = min(root.rightChild);
        return Math.min(Math.min(leftMin, rightMin), root.value);
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean equals(Tree other) {
        if(other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if(first == null && second == null)
            return true;
        if(first != null && second != null)
            return first.value == second.value && equals(first.leftChild, second.leftChild)
                                               && equals(first.rightChild, second.rightChild);
        return false;
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if(root == null)
            return true;
        if(root.value < min || root.value > max)
            return false;
        return isBinarySearchTree(root.leftChild, min, root.value - 1)
                && isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    public void printNodesAtKDistance(int distance) {
        printNodesAtKDistance(root, distance);
    }

    private void printNodesAtKDistance(Node root, int distance) {
        if(root == null)
            return;
        if(distance == 0) {
            System.out.println(root.value);
            return;
        }
        printNodesAtKDistance(root.leftChild, distance - 1);
        printNodesAtKDistance(root.rightChild, distance - 1);
    }

    public void traverseLevelOrder() {
        for(var i = 0 ; i <= height() ; i++)
            printNodesAtKDistance(i);
    }

}
