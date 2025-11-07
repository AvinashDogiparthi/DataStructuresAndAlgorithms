package L_Trie.A_ImplementTrie_PrefixTree_208;

class Trie {

    boolean isAnyWordCompleted;
    Trie[] childrens;

    public Trie() {

        isAnyWordCompleted = false;

        childrens = new Trie[26];
    }

    public void insert(String word) {

        Trie current = this;

        for(Character ch : word.toCharArray()){

            if(current.childrens[ch-'a'] == null){

                Trie trieNode = new Trie();

                current.childrens[ch-'a'] = trieNode;
            }

            current = current.childrens[ch-'a'];
        }

        current.isAnyWordCompleted = true;
    }

    public boolean search(String word) {

        Trie current = this;

        for(Character ch : word.toCharArray()){

            if(current.childrens[ch-'a']==null){
                return false;
            }

            current = current.childrens[ch-'a'];

        }

        return current.isAnyWordCompleted;
    }

    public boolean startsWith(String prefix) {

        Trie current = this;

        for(Character ch : prefix.toCharArray()){

            if(current.childrens[ch-'a']==null){
                return false;
            }

            current = current.childrens[ch-'a'];

        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
