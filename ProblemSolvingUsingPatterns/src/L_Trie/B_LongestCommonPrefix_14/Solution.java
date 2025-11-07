package L_Trie.B_LongestCommonPrefix_14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Trie trie = new Trie();
        for(String str : strs){
            trie.insert(str);
        }

        if(trie.occupiedChildrens > 1 || trie.isEndOfWord){
            return "";
        }

        String str = strs[0];
        StringBuilder result = new StringBuilder();

        Trie current = trie;
        for(Character ch : str.toCharArray()){
            result.append(ch);

            if(current.childrens[ch-'a'].occupiedChildrens > 1 || current.childrens[ch-'a'].isEndOfWord){
                return result.toString();
            }

            current = current.childrens[ch-'a'];
        }

        return result.toString();
    }

    static class Trie{

        boolean isEndOfWord;
        Trie[] childrens;
        int occupiedChildrens;

        public Trie(){
            isEndOfWord = false;
            childrens = new Trie[26];
            occupiedChildrens = 0;
        }

        public void insert(String string){
            Trie current = this;

            for(Character ch : string.toCharArray()){

                if(current.childrens[ch-'a'] == null){
                    Trie trieNode = new Trie();
                    current.childrens[ch-'a'] = trieNode;
                    current.occupiedChildrens = current.occupiedChildrens + 1;
                }

                current = current.childrens[ch-'a'];
            }

            current.isEndOfWord = true;
        }
    }
}