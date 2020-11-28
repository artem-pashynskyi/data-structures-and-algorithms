package mosh.binary;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Done");
        System.out.println(tree.find(6));
        System.out.println("***Traverse Pre-Order***");
        tree.traversePreOrder();
        System.out.println("***Traverse In-Order***");
        tree.traverseInOrder();
        System.out.println("***Traverse Post-Order***");
        tree.traversePostOrder();
        System.out.println("***Height***");
        System.out.println(tree.height());
        System.out.println("***Min***");
        System.out.println(tree.min());

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
        System.out.println("Done");
        System.out.println(tree.equals(tree2));
        System.out.println("***isBinarySearchTree***");
        System.out.println(tree.isBinarySearchTree());
//        tree.swapRoot();
//        System.out.println(tree.isBinarySearchTree());
        System.out.println("***printNodesAtKDistance***");
        tree.printNodesAtKDistance(2);
        System.out.println("***traverseLevelOrder***");
        tree.traverseLevelOrder();

        /*
         ************EXERCISES**************
         */
        System.out.println("***size***");
        System.out.println(tree.size());
        System.out.println("***countLeaves***");
        System.out.println(tree.countLeaves());
        System.out.println("***max***");
        System.out.println(tree.max());
        System.out.println("***contains***");
        System.out.println(tree.contains(10));
        System.out.println("***areSibling***");
        System.out.println(tree.areSibling(1, 6));
        System.out.println("***getAncestors***");
        System.out.println(tree.getAncestors(1));
    }

    // f(3)
    //   3 x f(2)
    //         2 x f(1)
    //               1 x f(0)
    public static int factorial(int n) {
        //Base condition
        if(n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    /*
    Exercise 8:
        Breadth first(level order): 20, 10, 30, 6, 14, 24, 3, 8, 26
        Depth first(pre-order):     20, 10, 6, 3, 8, 14, 30, 24, 26
        Depth first(in-order):      3, 6, 8, 10, 14, 20, 24, 26, 30
        Depth first(post-order):    3, 8, 6, 14, 10, 26, 24, 30, 20
    */

}
