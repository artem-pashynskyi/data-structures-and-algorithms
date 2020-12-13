public class Main {
    public static void main(String[] args) {
        TrieWithHashMap trie = new TrieWithHashMap();
        trie.insert("can");
        trie.insert("care");
        trie.insert("canada");
        System.out.println(trie.contains("can"));
        trie.traverse();
    }
}
