package leetcode.trees;

public class PopulatingNextRightPointersinEachNodeII {
    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    Node root;

    private void populateTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersinEachNodeII p = new PopulatingNextRightPointersinEachNodeII();
        p.populateTree();
        p.populatingNextRightPointersinEachNodeII(p.root);
    }

    public Node populatingNextRightPointersinEachNodeII(Node root) {
        if(root == null) return null;
        Node head = root;
        while(head != null) {
            Node temp = new Node(0);
            Node current = temp;

            while(head != null) {
                if(head.left != null) {
                    current.next = head.left;
                    current = current.next;
                }
                if(head.right != null) {
                    current.next = head.right;
                    current = current.next;
                }
                head = head.next;
            }

            head = temp.next;
        }
        return root;
    }

}
