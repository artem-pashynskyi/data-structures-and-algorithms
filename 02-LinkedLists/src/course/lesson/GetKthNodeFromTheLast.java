package course.lesson;

public class GetKthNodeFromTheLast {
    public static void main(String[] args) {

        var myLinkedList= new MyLinkedList();

        for(int j=1; j<=10;j++) myLinkedList.addLast(j);
        myLinkedList.printLinkedList();
        myLinkedList.insertInOrder(5);
        myLinkedList.insertInOrder(7);
        myLinkedList.printLinkedList();


    }
}
