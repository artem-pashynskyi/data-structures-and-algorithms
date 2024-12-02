package mosh2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.reverse();
        array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.reverse();
        array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromTheEnd(2));
    }
}
