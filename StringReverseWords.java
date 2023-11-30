// 557. Reverse Words in a String III

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "God Ding"
// Output: "doG gniD"


public class StringReverseWords {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        for(String s1:words){
            System.out.println("\n"+s1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            char[] c=words[i].toCharArray();
            int n=c.length-1;
            int j=0;
            while(j<n){
                char temp=c[j];
                c[j]=c[n];
                c[n]=temp;
                n--;
                j++;
            }
            sb.append(new String(c));
            if(i!=words.length-1)
            sb.append(" ");
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String str="Abhishek Todmal";
        String[] str2=str.split(" ");
        
        for(String s:str2){
            System.out.print(s);
        }

        StringReverseWords s=new StringReverseWords();
        System.out.println("\n"+s.reverseWords(str));
    }
}
