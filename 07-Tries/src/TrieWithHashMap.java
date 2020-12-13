import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrieWithHashMap {
    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }
    }

    private Node root = new Node(' ');

    public void insert(String word) {
        var current = root;
        for(var ch : word.toCharArray()) {
            if(current.children.get(ch) == null)
                current.children.put(ch, new Node(ch));
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        if(word == null)
            return false;
        var current = root;
        for(var ch : word.toCharArray()) {
            if(current.children.get(ch) == null)
                return false;
            current = current.children.get(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node root) {
        System.out.println(root.value);
        for(Node child : root.getChildren())
            traverse(child);
    }

}
