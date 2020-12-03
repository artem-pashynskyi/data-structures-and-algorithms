package course.lesson;

public class Tree {
    private class Node {
        private Node leftChild;
        private Node rightChild;
        private int value;

        public Node(int value) {
            this.value = value;
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
                    return;
                }
                current = current.leftChild;
            }
            if(value > current.value) {
                if(current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.value + " ");
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
        System.out.print(root.value + " ");
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
        System.out.print(root.value + " ");
    }

}
