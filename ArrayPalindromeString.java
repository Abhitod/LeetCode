// 2108. Find First Palindromic String in the Array

// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.

// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// Example 2:

// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".
// Example 3:

// Input: words = ["def","ghi"]
// Output: ""
// Explanation: There are no palindromic strings, so the empty string is returned


public class ArrayPalindromeString {
        public String firstPalindrome(String[] words) {
            for(int i=0;i<words.length;i++){
                if(isPal(words[i])){
                    return words[i];
                }
            }
            return "";
        }
        public boolean isPal(String s){
            StringBuffer sb=new StringBuffer(s);
            sb=sb.reverse();
            System.out.println(sb);
            boolean pal=s.equals(sb);   
            System.out.println(pal);    //false
            return s.equals(""+sb);
        }

        public static void main(String[] args) {
            ArrayPalindromeString a=new ArrayPalindromeString();
            System.out.println(a.isPal("racecar"));
        }
    }

