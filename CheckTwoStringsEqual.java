// 1662. Check If Two String Arrays are Equivalent

// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

// A string is represented by an array if the array elements concatenated in order forms the string.

// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true./ Example 2:

// Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
// Output: false 

// Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
// Output: true



public class CheckTwoStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(int i=0;i<word1.length;i++){
            s1=s1+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s2=s2+word2[i];
        }
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        CheckTwoStringsEqual c=new CheckTwoStringsEqual();
        String[] word1=  {"ab", "c"};
        String[] word2=  {"a", "bc"};

        String s1="";
        String s2="";
        String s3="abcd";
        s3=s3.concat("get");
        System.out.println(s3);

        for(int i=0;i<word1.length;i++){
            s1=s1+word1[i];
        }
        System.out.println(s1); 
        System.out.println(c.arrayStringsAreEqual(word1, word2));



    }
}
