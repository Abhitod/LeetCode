// 1859. Sorting the Sentence
// Solved
// Easy
// Topics
// Companies
// Hint
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

// A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

// For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
// Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

// Example 1:

// Input: s = "is2 sentence4 This1 a3"
// Output: "This is a sentence"
// Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
// Example 2:

// Input: s = "Myself2 Me1 I4 and3"
// Output: "Me Myself and I"
// Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.




public class SortingSentence {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] result=new String[str.length];
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(String ele:str){
            i=(int)(ele.charAt(ele.length()-1)-'0');// This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])

            result[i-1]=ele.substring(0,ele.length()-1);// This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
        }
            for(i=0;i<result.length-1;i++)
                sb.append(result[i]).append(" ");
                sb.append(result[i]);
            
            return sb.toString();
        
    }
}
