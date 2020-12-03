package leetcode.trees;

import java.util.ArrayList;

public class IncreasingOrderSearchTree {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /*
        Given the root of a binary search tree,
        rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
        and every node has no left child and only one right child.
     */
    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            traverseInOrder(root, list);
            TreeNode node = new TreeNode(0);
            root = node;
            for(Integer i : list) {
                node.right = new TreeNode(i);
                node = node.right;
            }
            return root.right;
        }

        private void traverseInOrder(TreeNode root, ArrayList<Integer> list) {
            if(root == null)
                return;
            traverseInOrder(root.left, list);
            list.add(root.val);
            traverseInOrder(root.right, list);
        }

    }

}
