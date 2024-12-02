package mosh2;

import java.util.LinkedList;

public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        hash(key);

    }

    public String get(int key) {
        return "";
    }

    public void remove() {

    }

    private int hash(int key) {
        return key % entries.length;
    }

}
