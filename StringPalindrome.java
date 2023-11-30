public class StringPalindrome {
    public static void main(String[] args) {
        String s="A man a plan a canal Panamazzzz";
        String s2=s.toLowerCase().replaceAll("\\s", "");
        System.out.println(s2);
        char[] c1=s2.toCharArray();
        
        StringBuilder sb=new StringBuilder(s2);
        StringBuilder sb2=sb.reverse();
        char[] c2=new char[sb2.length()];

        System.out.println();

        int j=0;
        for(int i=sb2.length()-1;i>=0;i--){
            c2[j]=sb2.charAt(i);
            j++;
        }
        System.out.println(c2);
        System.out.println(sb.equals(sb2));
    }
}
