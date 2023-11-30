// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.



public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String substr=s.substring(0,i);
                StringBuilder repeated=new StringBuilder();
                for(int j=0;j<n/i;j++){
                    repeated.append(substr);
                }
                if(repeated.toString().equals(s))
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="abcabcabc";
        RepeatedSubstring r=new RepeatedSubstring();
        System.out.println(r.repeatedSubstringPattern(str));
    }
}
