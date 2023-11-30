public class Shuffle {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,0};
        int n=5;
        int[] result = new int[2 * n];
    int index = 0;

    // Interleave elements from the first half and second half
    for (int i = 0; i < n; i++) {
        result[index] = nums[i]; // Add the element from the first half
        result[index] = nums[i + n]; // Add the element from the second half
    }
    for(int i=0;i<nums.length;i++){
        System.out.print(result[i]+" ");
        }
    }
}
