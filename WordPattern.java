// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            boolean contsainsKey=map.containsKey(ch);
            if(map.containsValue(words[i]) && !map.containsKey(ch))
            return false;
            if(map.containsKey(ch) && !map.get(ch).equals(words[i]))
            return false;
            else
            map.put(ch,words[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        WordPattern w=new WordPattern();
        System.out.println(w.wordPattern("abba",  "dog cat cat dog"));
    }
}
