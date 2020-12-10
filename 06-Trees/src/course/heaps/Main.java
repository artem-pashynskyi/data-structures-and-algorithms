package course.heaps;

public class Main {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        heap.insert(23);
        heap.insert(32);
        heap.insert(91);
        heap.insert(100);
        heap.insert(2);
        heap.insert(101);
        heap.insert(600);
        heap.print();
    }
}
