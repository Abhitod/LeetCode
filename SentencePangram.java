// 1832. Check if the Sentence Is Pangram
// Solved
// Easy
// Topics
// Companies
// Hint
// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.

// Input: sentence = "leetcode"
// Output: false



import java.util.HashMap;
import java.util.Map;

public class SentencePangram {
     public boolean checkIfPangram(String sentence) {
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            hmap.put(sentence.charAt(i),1);
        }
        return hmap.size()==26?true:false;
    }
    public static void main(String[] args) {
        System.out.println('+');
        char c='+';
        System.out.println(c);
    }
}
