// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.





import java.util.Arrays;

public class LongestCommonPrefix {
    static String[] str={"flower","flow","flight"};
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }

        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        while(index<s1.length() && index<s2.length()){
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
    public static void main(String[] args) {
        String[] str={"coding", "codezen", "codingninja", "coders"};
        LongestCommonPrefix l=new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(str));
    }
}
