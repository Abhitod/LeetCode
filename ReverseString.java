public class ReverseString
{
    public static void main(String[] args) {
        
        String str="racecar";
        String str2="";
        
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);   

        System.out.println(str.equals(str2));
    }
}