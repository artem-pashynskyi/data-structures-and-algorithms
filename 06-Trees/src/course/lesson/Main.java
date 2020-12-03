package course.lesson;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] numArray = {10,6,8,20,4,9,5,17,42,47,29};
        for(int i : numArray) {
            tree.insert(i);
        }
        System.out.println("***PreOrder***");
        tree.traversePreOrder();
        System.out.println("");
        System.out.println("***InOrder***");
        tree.traverseInOrder();
        System.out.println("");
        System.out.println("***PostOrder***");
        tree.traversePostOrder();
    }
}
