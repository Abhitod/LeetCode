// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.




public class FirstOccurenceString {

        // public int strStr(String haystack, String needle) {
        //     int hlength=haystack.length();
        //     int nlength=needle.length();
        //     if(hlength<nlength){
        //         return 1;
        //     }
        //     for(int i=0;i<hlength-nlength;i++){
        //         int j=0;
        //         while(j<nlength && haystack.charAt(i+j)==needle.charAt(j))
        //             j++;
        //             if(j==nlength){
        //                 return i;
        //             }
        //     }
        //     return -1;
        // }

            public int strStr(String haystack, String needle) {
                int hLen = haystack.length();
                int nLen = needle.length();
                int nIndex = 0;

                if (needle.isEmpty()) {
                    return 0; // An empty needle is always found at index 0.
                }

                for(int i=0; i<hLen; i++){
                    // as long as the characters are equal, increment needleIndex
                    if(haystack.charAt(i)==needle.charAt(nIndex)){
                        nIndex++;
                    }
                    else{
                        // start from the next index of previous start index
                        i=i-nIndex;
                        // needle should start from index 0
                        nIndex=0;
                    }
                    // check if needleIndex reached needle length
                    if(nIndex==nLen){
                        // return the first index
                        System.out.println("found at index");
                        return 0;
                    }
                }
                return -1;
            }
        

        public static void main(String[] args) {
            String h="butsa";
            String n="sad";
            FirstOccurenceString f=new FirstOccurenceString();
            System.out.println(f.strStr(h,n));

            System.out.println("some");
            int x=144;
            double temp;
            double sr=x/2;
            do{
                temp=sr;
                temp=((temp+(x/temp))/2);
            }while((temp-sr)!=0);
            System.out.println(sr);
        }
}
