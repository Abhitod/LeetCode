public class ArrowRotation {
    public static int solution(String S) {
        // Initialize counters for each arrow direction
        int upCount = 0;
        int downCount = 0;
        int leftCount = 0;
        int rightCount = 0;

        // Count the occurrences of each arrow direction
        for (char arrow : S.toCharArray()) {
            if (arrow == '^') {
                upCount++;
            } else if (arrow == 'v') {
                downCount++;
            } else if (arrow == '<') {
                leftCount++;
            } else if (arrow == '>') {
                rightCount++;
            }
        }

        // Find the maximum count among all directions
        int maxCount = Math.max(Math.max(upCount, downCount), Math.max(leftCount, rightCount));

        // Calculate the minimum number of rotations needed
        int minRotations = S.length() - maxCount;

        return minRotations;
    }

    public static void main(String[] args) {
        System.out.println(solution("^vv<v"));   // Output: 2
        System.out.println(solution("v>>>wv"));  // Output: 3
        System.out.println(solution("<<<<"));    // Output: 0
    }
}
