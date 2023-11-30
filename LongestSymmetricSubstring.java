public class LongestSymmetricSubstring {
    public static void main(String[] args) {
        String inputString1 = "<><??>>";
        String inputString2 = "??????";

        int[] result1 = findLongestSymmetricSubstring(inputString1);
        int[] result2 = findLongestSymmetricSubstring(inputString2); 

        // System.out.println(findLongestSymmetricSubstring);

        int length1 = result1[0];
        String replacedString1 = replaceQuestionMarks(inputString1, result1[1], result1[2]);

        int length2 = result2[0];
        String replacedString2 = replaceQuestionMarks(inputString2, result2[1], result2[2]);

        System.out.println("Input 1: " + inputString1);
        System.out.println("Longest symmetric substring length: " + length1);
        System.out.println("Replaced string: " + replacedString1 + "\n");

        System.out.println("Input 2: " + inputString2);
        System.out.println("Longest symmetric substring length: " + length2);
        System.out.println("Replaced string: " + replacedString2 + "\n");
    }

    public static int[] findLongestSymmetricSubstring(String s) {
        int max_length = 0;
        int max_start = -1;
        int max_end = -1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                String replacedSubstring = substring.replace("?", "<").replace("?", ">");

                if (isSymmetric(replacedSubstring)) {
                    if (substring.length() > max_length) {
                        max_length = substring.length();
                        max_start = i;
                        max_end = j;
                    }
                }
            }
        }

        return new int[]{max_length, max_start, max_end};
    }

    public static boolean isSymmetric(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String replaceQuestionMarks(String s, int start, int end) {
        return s.replaceAll("\\?", "<>");
    }
}

